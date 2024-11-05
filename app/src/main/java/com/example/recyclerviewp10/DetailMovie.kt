package com.example.recyclerviewp10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewp10.databinding.DetailMovieBinding

class DetailMovie: AppCompatActivity() {
    private lateinit var binding: DetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getIntExtra("imageId", 0) ?: "Empty"
        val title = intent.getStringExtra("title") ?: "123"
        val duration = intent.getStringExtra("duration") ?: "Empty"
        val rating = intent.getStringExtra("rating") ?: "Empty"
        val synopsis = intent.getStringExtra("synopsis") ?: "Empty"

        with(binding) {
            actionBack.setOnClickListener {
                finish()
            }
            imageMovieDetail.setImageResource(image as Int)
            titleMovieDetail.text = title
            durasiDetailMovie.text = duration
            ratingDetailMovie.text = rating
            txtDesc.text = synopsis

        }
    }
}