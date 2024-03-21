import Data.MovieResponse
import com.google.gson.annotations.SerializedName

data class Movie(
    val title: String,
    val releaseYear: String,
    val posterPath: String,
    val overview: String,
    val runtime: String,
    val director: String,
    val genres: List<String>,
    val productionCountries: List<String>)


data class MoviResponse(
    @SerializedName("results")
    val results:List<Movie>)


