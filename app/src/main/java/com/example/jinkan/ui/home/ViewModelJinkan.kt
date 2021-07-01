package com.example.jinkan.ui.home

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.jinkan.models.Risposte
import com.example.jinkan.models.Top
import com.example.jinkan.retrofit.RetroCleint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ViewModelJinkan(application: Application) : AndroidViewModel(application) {


    var list = MutableLiveData<List<Top>>()

    init {
        getTops()
    }

    fun getTops() {

        RetroCleint().createService()?.geTop()?.enqueue(object : Callback<Risposte> {
            override fun onResponse(call: Call<Risposte>, response: Response<Risposte>) {


                list.value = response.body()?.top

                Log.d("mario", "$list")

            }

            override fun onFailure(call: Call<Risposte>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })


    }

}