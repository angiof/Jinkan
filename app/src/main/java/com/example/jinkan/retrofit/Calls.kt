package com.example.jinkan.retrofit

import com.example.jinkan.models.Risposte
import com.example.jinkan.models.Top
import retrofit2.Call
import retrofit2.http.GET

interface Calls {


    @GET("top/anime/1/upcoming")
    fun geTop(): Call<Risposte>



}