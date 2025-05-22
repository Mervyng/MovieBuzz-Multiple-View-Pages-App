package com.example.moviebuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviebuzz.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMovieTitle.text = "The Amazing Spider-Man (2012)"

        binding.tvFullDescription.text = "After Peter Parker is bitten by a genetically altered spider, he gains newfound spider-like powers and ventures out to solve the mystery of his parents' disappearance. Meanwhile, he must face Dr. Curt Connors, his father's former partner who becomes the powerful Lizard."

        binding.tvCast.text = """
            • Andrew Garfield as Peter Parker / Spider-Man
            • Emma Stone as Gwen Stacy
            • Rhys Ifans as Dr. Curt Connors / Lizard
            • Denis Leary as Captain Stacy
            • Martin Sheen as Uncle Ben
            • Sally Field as Aunt May
        """.trimIndent()
    }
}
