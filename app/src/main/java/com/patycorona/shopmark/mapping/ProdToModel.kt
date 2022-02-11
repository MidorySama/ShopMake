package com.patycorona.shopmark.mapping

import com.patycorona.shopmark.models.ManyProdResponse
import com.patycorona.shopmark.models.Prod

internal fun ManyProdResponse.toModel(): MutableList<Prod> {
    val productList: MutableList<Prod> = mutableListOf()

    products.map { prod ->
        productList.add(
            Prod(
                idproducto = prod.idProduct,
                name = prod.name,
                precious = prod.price,
                descuento = prod.discount,
                ImageProd = prod.productPhoto,
                stock = prod.stock

            )
        )
    }

    return productList

}

