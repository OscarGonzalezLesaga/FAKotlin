package com.example.gangamesdk

import com.example.gangamesdk.serializer.TopGameDeserializer
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GangameApiService(val apiConfig: GangameApiConfig = GangameClientConfig()) {

    val apiClient: RetrofitGangameApi

    init {
        val gson = GsonBuilder().registerTypeAdapter(TopGame::class.java, TopGameDeserializer()).create()



        val apiClientConfig = Retrofit.Builder().baseUrl(Routes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

        apiConfig.setupConfig(apiClientConfig)

        apiClient = apiClientConfig.build().create(RetrofitGangameApi::class.java)

    }
}