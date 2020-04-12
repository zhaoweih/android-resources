package com.example.retrofittest

import retrofit2.Call
import retrofit2.http.GET

interface AppService {

    @GET("get_data.json")
    fun getAppData(): Call<List<App>>

}