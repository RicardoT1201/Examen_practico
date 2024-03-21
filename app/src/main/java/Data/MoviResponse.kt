import java.io.Serializable

data class Movie(
    val title: String,
    val releaseYear: String,
    val posterPath: String,
    val overview: String,
    val runtime: String,
    val director: String,
    val genres: List<String>,
    val productionCountries: List<String>
) : Serializable
