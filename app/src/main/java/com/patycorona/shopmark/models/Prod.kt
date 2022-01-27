package com.patycorona.shopmark.models

data class Prod(
    var idproducto: Int,
    var name: String = "",
    var precious: Double = 0.0,
    var descuento: Int,
    var ImageProd: Int,
    var stock: Int
    )
{
    fun add(producto: Prod){}
}
