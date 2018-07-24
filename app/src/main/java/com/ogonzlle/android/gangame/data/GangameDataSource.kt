package com.ogonzlle.android.gangame.data

import com.example.gangamesdk.GangameApiService
import java.util.*

object GangameDataSource {
    val apiService = GangameApiService()

    fun getDeals(): Observable<ArrayList<Deal>> {
        return apiService.apiClient.getDealsObservable().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
    }

}