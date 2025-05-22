package com.example.moviebuzz

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.moviebuzz.databinding.ActivityUsernameInputBinding
import androidx.core.content.edit

class ActivityUsernameInput : AppCompatActivity() {
    private lateinit var binding: ActivityUsernameInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsernameInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve existing username if available
        val prefs = getSharedPreferences("MovieBuzzPrefs", MODE_PRIVATE)
        val existingUsername = prefs.getString("username", "")
        if (!existingUsername.isNullOrEmpty()) {
            binding.etUsername.setText(existingUsername)
        }

        binding.btnSaveUsername.setOnClickListener {
            val enteredName = binding.etUsername.text.toString().trim()

            if (enteredName.isEmpty()) {
                Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
            } else {
                // Save username to SharedPreferences
                prefs.edit {
                    putString("username", enteredName)
                    apply()
                }

                // Navigate to WelcomeActivity
                startActivity(Intent(this, WelcomeActivity::class.java))
                finish()
            }
        }
    }
}
