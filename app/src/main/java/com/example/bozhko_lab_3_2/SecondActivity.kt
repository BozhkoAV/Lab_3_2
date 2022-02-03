package com.example.bozhko_lab_3_2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bozhko_lab_3_2.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = SecondActivityBinding.inflate(this.layoutInflater)
        binding.button.setOnClickListener {
            finish()
        }
        binding.button2.setOnClickListener {
            val i = Intent(this, ThirdActivity::class.java)
            startActivityForResult(i, 0)
        }

        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0 && resultCode == 1) finish()
    }
}