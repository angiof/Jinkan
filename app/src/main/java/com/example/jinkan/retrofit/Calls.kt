package com.example.jinkan.retrofit

import com.example.jinkan.models.Risposte
import com.example.jinkan.models.Top
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Calls {


    @GET("top/anime/1/upcoming")
    fun geTop(@Query("order_by year")year :Int): Call<Risposte>



}