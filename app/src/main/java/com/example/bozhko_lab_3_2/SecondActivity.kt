package com.example.bozhko_lab_3_2

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.bozhko_lab_3_2.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout

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

        drawerLayout = binding.drawerLayout

        binding.toolbar.setOnMenuItemClickListener {
            onOptionsItemSelected(it)
        }

        binding.button7.setOnClickListener {
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
        if (requestCode == 0 && resultCode == 1) finish()
        if (requestCode == 1 && resultCode == 1) drawerLayout.close()
    }
}