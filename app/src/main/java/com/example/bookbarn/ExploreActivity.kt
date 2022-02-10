package com.example.bookbarn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookbarn.databinding.ActivityExploreBinding

class ExploreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExploreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExploreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    }


