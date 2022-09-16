package com.example.minorities_space

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.minorities_space.databinding.ActivityTerceiratelaBinding

class terceiratela : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityTerceiratelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityTerceiratelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icLgbt.setOnClickListener(this)
        binding.icGender.setOnClickListener(this)
        binding.icTrans.setOnClickListener(this)
        binding.icHome.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.ic_lgbt) {
            novaTela()
        } else if (view.id == R.id.ic_gender) {
            novaTela1()
        } else if (view.id == R.id.ic_trans) {
            novaTela2()
        } else if (view.id == R.id.ic_home) {
            novaTela3()
        }
    }

    private fun novaTela() {
        startActivity(Intent(this, QuartaTela::class.java))
    }

    private fun novaTela1() {
        startActivity(Intent(this, QuintaTela::class.java))
    }

    private fun novaTela2() {
        startActivity(Intent(this, terceiratela::class.java))
    }

    private fun novaTela3() {
        startActivity(Intent(this, SegundaTela::class.java))
    }

}