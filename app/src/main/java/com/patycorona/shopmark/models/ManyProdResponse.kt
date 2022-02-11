package com.patycorona.shopmark.models

import com.google.gson.annotations.SerializedName

class ManyProdResponse (
    @SerializedName("product") val products: MutableList<ProdResponse> = mutableListOf()
)