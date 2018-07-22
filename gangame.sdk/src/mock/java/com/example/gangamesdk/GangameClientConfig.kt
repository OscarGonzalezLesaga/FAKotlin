package com.example.gangamesdk

import okhttp3.OkHttpClient
import retrofit2.Retrofit

class GangameClientConfig : GangameApiConfig {

    companion object {
        const val DEFAULT_RESPONSE = "{\"status\": \"success\"}"
    }

    override fun setupConfig(builder: Retrofit.Builder) {
        val client = OkHttpClient.Builder()
                .addInterceptor(MockResponseInterceptor(getMockReponses(), DEFAULT_RESPONSE))
                .build()
        builder.client(client)
    }

    private fun getMockReponses(): HashMap<String, String> {
        return hashMapOf(
                Pair(Routes.GET_DEALS, MockResponses.DEALS_RESPONSE),
                Pair(Routes.GET_TOP_100_GAMES, MockResponses.TOP_100_GAMES),
                Pair(Routes.GET_MOST_OWNED, MockResponses.TOP_100_GAMES)
        )
    }
}