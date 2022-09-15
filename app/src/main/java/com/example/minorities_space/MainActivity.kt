package com.example.minorities_space

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minorities_space.R.layout.activity_main
import com.example.minorities_space.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activity_main)
    }
}