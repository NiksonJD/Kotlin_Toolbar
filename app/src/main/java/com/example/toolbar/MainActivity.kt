package com.example.toolbar

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "home"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this,"Sync",Toast.LENGTH_SHORT).show()
                binding.root.setBackgroundColor(Color.parseColor("#FFA07A"))
            }
            R.id.delete -> {
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
                binding.root.setBackgroundColor(Color.parseColor("#FFFFFF"))
            }
            R.id.mood -> {
                Toast.makeText(this,"Mood",Toast.LENGTH_SHORT).show()
                binding.root.setBackgroundColor(Color.parseColor("#0000FF"))
            }
            R.id.wifi -> {
                Toast.makeText(this,"WiFi",Toast.LENGTH_SHORT).show()
                binding.root.setBackgroundColor(Color.parseColor("#FF69B4"))
            }

        }
        return true
    }
}