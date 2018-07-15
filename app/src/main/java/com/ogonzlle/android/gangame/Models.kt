package com.ogonzlle.android.gangame

object PriceFormatted {
    val FORMAT_PRICE = "$%.2f"

    fun priceFormatted(price: Float) = String.format(FORMAT_PRICE, price)
}

data class Deal(var title: String,
                var salePrice: Float,
                var normalPrice: Float,
                var metacriticScore: Int,
                var steamRating: Int,
                var thumb: String) {

    val salePriceFormatted: String
        get() = PriceFormatted.priceFormatted(salePrice)

    val normalPriceFormatted: String
        get() = PriceFormatted.priceFormatted(normalPrice)


}

data class TopGame(var title: String,
                   var owners: Int,
                   var steamRating: Int,
                   var publisher: String,
                   var price: Float,
                   var position: Int,
                   var thumb: String) {

    val priceFormatted: String
        get() = PriceFormatted.priceFormatted(price)
}

