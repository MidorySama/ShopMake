package com.patycorona.shopmark.models

import android.os.Parcelable
//import kotlin.android.parcel.Parcelize
//import kotlin.android.parcel.RawValue

data class ProdModel( var hits:MutableList<Prod> = mutableListOf(),
val page:Int = 0,
val totalPages:Int = 0,
val hitsPerPage:Int = 0
)
