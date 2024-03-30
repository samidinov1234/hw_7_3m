package com.example.hw_7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_7_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.img_container, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.playlist_container, SecondFragment())
            .commit()

    }
}