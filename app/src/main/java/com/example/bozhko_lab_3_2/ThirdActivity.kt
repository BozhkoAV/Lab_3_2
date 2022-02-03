package com.example.bozhko_lab_3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bozhko_lab_3_2.databinding.ThirdActivityBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ThirdActivityBinding.inflate(this.layoutInflater)
        binding.button4.setOnClickListener {
            setResult(1)
            finish()
        }
        binding.button5.setOnClickListener {
            setResult(2)
            finish()
        }

        setContentView(binding.root)
    }
}