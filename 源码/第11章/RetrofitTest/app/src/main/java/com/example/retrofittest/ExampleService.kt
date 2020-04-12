package com.example.retrofittest

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ExampleService {

    @GET("get_data.json")
    fun getData(@Header("User-Agent") userAgent: String, @Header("Cache-Control") cacheControl: String): Call<Data>
//    fun getData(@Query("user") user: String, @Query("token") token: String): Call<Data>

    @DELETE("data/{id}")
    fun deleteData(@Path("id") id: String): Call<ResponseBody>

    @POST("data/create")
    fun createData(@Body data: Data): Call<ResponseBody>

}