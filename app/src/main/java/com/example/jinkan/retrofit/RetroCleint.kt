package com.example.jinkan.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroCleint {
    private val BASE_URL = "https://api.jikan.moe/v3/"
    private lateinit var instances: Retrofit
    private var retrofit: Retrofit? = null
    private var looggingInterceptor: HttpLoggingInterceptor? = null
    private var httPclientBuilder: OkHttpClient.Builder? = null


    fun webServices() {
        looggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        httPclientBuilder = OkHttpClient.Builder().addInterceptor(looggingInterceptor!!)
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(httPclientBuilder!!.build())
            .addConverterFactory(GsonConverterFactory.create()) //   .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }


    companion object {
        var instance: RetroCleint? = null
            get() {
                if (field == null) {
                    instance = RetroCleint()
                }
                return field
            }
    }

    fun createService(): Calls? {
        webServices()
        return retrofit!!.create(Calls::class.java)
    }

    fun getRetrofit(): Retrofit? {
        return retrofit
    }

    fun setRetrofit(retrofit: Retrofit?) {
        this.retrofit = retrofit
    }
}