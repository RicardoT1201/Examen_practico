package utils

import data.MovieServiceApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofitprovider {
    companion object{
        fun Retrofit(): MovieServiceApi{
            val retrofit = Retrofit.Builder()
                .baseUrl(Constants.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(MovieServiceApi::class.java)
        }
    }
}