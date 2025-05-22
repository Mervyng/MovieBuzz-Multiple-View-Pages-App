package com.example.moviebuzz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviebuzz.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prefs = getSharedPreferences("MovieBuzzPrefs", MODE_PRIVATE)
        val username = prefs.getString("username", null)

        binding.tvWelcome.text = if (!username.isNullOrEmpty()) {
            "Hi $username, welcome to the MovieBuzz app!"
        } else {
            "Hi User, welcome to the MovieBuzz app!"
        }

        binding.btnShowMovies.setOnClickListener {
            startActivity(Intent(this, MoviesActivity::class.java))
        }

        binding.btnChangeUsername.setOnClickListener {
            startActivity(Intent(this, ActivityUsernameInput::class.java))
            finish() // Optional: close WelcomeActivity to refresh on return
        }
    }
}
