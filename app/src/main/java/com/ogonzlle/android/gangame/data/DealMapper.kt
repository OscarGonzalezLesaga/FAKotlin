package com.ogonzlle.android.gangame.data

import com.example.gangamesdk.Deal

object DealMapper {
    fun fromSdk(deal: Deal): com.ogonzlle.android.gangame.Deal {
        return com.ogonzlle.android.gangame.Deal(deal.title, deal.salePrice, deal.normalPrice, deal.metacriticScore, deal.steamRating, deal.thumb)
    }
}