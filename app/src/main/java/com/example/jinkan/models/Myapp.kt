package com.example.jinkan.models

import android.app.Application

class Myapp :Application() {

    companion object{

        //instance del context
        lateinit var instance:Myapp

        init {

            instance= instance
        }

    }

    override fun onCreate() {
        super.onCreate()
        //instance dal on create app
        instance=this
    }
}