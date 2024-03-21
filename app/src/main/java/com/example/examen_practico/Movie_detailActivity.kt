
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examen_practico.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movie = intent.getSerializableExtra("movie") as Movie


        titleTextView.text = movie.title
        yearTextView.text = movie.releaseYear
        synopsisTextView.text = movie.overview
        durationTextView.text = movie.runtime
        directorTextView.text = movie.director
        genreTextView.text = movie.genres.joinToString()
        countryTextView.text = movie.productionCountries.joinToString()

        Picasso.get().load("https://image.tmdb.org/t/p/w500/${movie.posterPath}")
            .into(posterImageView)
    }
}
