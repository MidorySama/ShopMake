package com.patycorona.shopmark.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

 class Prod(
    var idproducto: Int,
    var name: String = "",
    var precious: Double = 0.0,
    var descuento: Int,
    var ImageProd: String,
    var stock: Int
    ): Parcelable {}

