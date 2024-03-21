package com.example.examen_practico

import Data.MovieResponse
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response

class MovieAdapter(movies: List<Any>, mainActivity: MainActivity) {

}

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter
    open class MovieClickListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

            fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                val movies = response.body()?.results ?: emptyList()
                movieAdapter = MovieAdapter(movies, this@MainActivity)
                //recyclerView.adapter = movieAdapter
            }

            fun onFailure(call: Call<MovieResponse>, t: Throwable) {
            }
        }
    }



