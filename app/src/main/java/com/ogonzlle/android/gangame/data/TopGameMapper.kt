package com.ogonzlle.android.gangame.data

import com.ogonzlle.android.gangame.TopGame

object TopGameMapper {
    fun fromSdk(topGame: com.example.gangamesdk.TopGame, position: Int): TopGame {
        return TopGame(topGame.title, topGame.owners, topGame.steamRating, topGame.publisher, topGame.price, position, topGame.thumb)
    }
}