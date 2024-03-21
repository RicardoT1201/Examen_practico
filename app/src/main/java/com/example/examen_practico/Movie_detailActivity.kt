package com.example.examen_practico

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examen_practico.R
import com.squareup.picasso.Picasso

class MovieDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_movie_detail)

        //val movie = intent.getSerializableExtra("movie") as Movie

        /*titleTextView.text = movie.title
        yearTextView.text = movie.releaseYear
        synopsisTextView.text = movie.overview
        durationTextView.text = "Duration: ${movie.runtime}"
        directorTextView.text = "Director: ${movie.director}"
        genreTextView.text = "Genre: ${movie.genre}"
        countryTextView.text = "Country: ${movie.country}"

        // Load poster image using Picasso
        Picasso.get().load(movie.posterUrl).into(posterImageView)*/
    }
}