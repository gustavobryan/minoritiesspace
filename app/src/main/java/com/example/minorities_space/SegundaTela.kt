package com.example.minorities_space

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.minorities_space.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
        binding.home.setOnClickListener(this) {
           val imgLgbt = Intent(this,MainActivity)

    }        }
        binding.imgLgbt.setOnClickListener(this)
        binding.imgGender.setOnClickListener(this)
        binding.imgTrans.setOnClickListener(this)

        binding.buttonFrases.setOnClickListener(this) {
            val Gerarfrases = (Intent(this, MainActivity::class.java))
            startActivity(Gerarfrases)
        }








