package com.example.hw_7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_7_3m.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.getSerializableExtra("model") as Playlist
        binding.tvNameSecond.text = data.songOwner
        binding.tvMusicNameSecond.text = data.songName
        binding.tvLengthSecond.text = data.length
    }
}