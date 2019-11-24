package com.jm.johnmollaghanteamworkapp.networking

import com.google.gson.GsonBuilder

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://yat.teamworkpm.net"
    private var retrofit: Retrofit? = null

    val retrofitInstance: Retrofit?
        get() {

            val gson = GsonBuilder()
                .setLenient()
                .create()

            val client = OkHttpClient.Builder()
                .addNetworkInterceptor(
                    BasicAuthInterceptor(
                        "twp_ocsj8PR64FIV48fHVXCy75gBruca",
                        "password"
                    )
                )
                .build()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit
        }
}
