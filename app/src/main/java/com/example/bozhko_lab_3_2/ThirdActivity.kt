package com.example.bozhko_lab_3_2

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.bozhko_lab_3_2.databinding.ThirdActivityBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ThirdActivityBinding.inflate(this.layoutInflater)
        binding.bnToFirst.setOnClickListener {
            setResult(1)
            finish()
        }
        binding.bnToSecond.setOnClickListener {
            setResult(2)
            finish()
        }

        drawerLayout = binding.drawerLayout

        binding.toolbar.setOnMenuItemClickListener {
            onOptionsItemSelected(it)
        }

        binding.bnToAbout.setOnClickListener {
            drawerLayout.close()
            val i = Intent(this, AboutActivity::class.java)
            startActivity(i)
        }

        setContentView(binding.root)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.open_drawer_layout) {
            drawerLayout.open()
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}