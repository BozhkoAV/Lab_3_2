package com.example.bozhko_lab_3_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bozhko_lab_3_2.databinding.FirstActivityBinding

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstActivityBinding.inflate(this.layoutInflater)
        binding.button3.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

        setContentView(binding.root)
    }
}