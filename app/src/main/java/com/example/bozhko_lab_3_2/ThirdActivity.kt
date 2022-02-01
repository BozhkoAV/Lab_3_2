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
        binding.button4.setOnClickListener {
            setResult(1)
            finish()
        }
        binding.button5.setOnClickListener {
            setResult(2)
            finish()
        }

        drawerLayout = binding.drawerLayout

        binding.toolbar.setOnMenuItemClickListener {
            onOptionsItemSelected(it)
        }

        binding.button8.setOnClickListener {
            val i = Intent(this, AboutActivity::class.java)
            startActivityForResult(i, 1)
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == 1) drawerLayout.close()
    }
}