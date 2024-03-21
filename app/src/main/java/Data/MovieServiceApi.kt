package data

import Data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import utils.Constants.Companion.API_KEY

interface MovieServiceApi {

    @GET("?apikey=$API_KEY")
    suspend fun searchByName(@Query("s") movieName: String): Response<MovieServiceApi>

    @GET("?apikey=$API_KEY")
    suspend fun searchById(@Query("i") movieId: String): Response<MovieResponse>
}