package com.example.examen_practico

import Data.MovieResponse
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_practico.R
import retrofit2.Call
import retrofit2.Response

class MovieAdapter {
    open class MovieClickListener {

    }

}

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                val movies = response.body()?.results ?: emptyList()
                movieAdapter = MovieAdapter(movies, this@MainActivity)
                recyclerView.adapter = movieAdapter
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                // Manejar el fallo de la llamada a la API
            }
        }
    }



