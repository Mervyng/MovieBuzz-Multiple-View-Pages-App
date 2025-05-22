package com.example.moviebuzz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val btnShowMore = findViewById<Button>(R.id.btnShowMore)
        btnShowMore.setOnClickListener {
            val intent = Intent(this, MovieDetailActivity::class.java)
            startActivity(intent)
        }
    }
}
