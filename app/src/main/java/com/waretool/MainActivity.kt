package com.waretool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waretool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    companion object {
        init {
            System.loadLibrary("rwnative")
        }
    }
}