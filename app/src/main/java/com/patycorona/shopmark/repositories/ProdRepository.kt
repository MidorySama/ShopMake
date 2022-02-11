package com.patycorona.shopmark.repositories

import com.patycorona.shopmark.api.CoreHomeApi
import com.patycorona.shopmark.mapping.toModel
import com.patycorona.shopmark.models.Prod
import io.reactivex.Single
import javax.inject.Inject


class ProdRepository @Inject constructor(
    private val apiService: CoreHomeApi
){

    fun getProducts(): Single<MutableList<Prod>> {
        return apiService.getProduct()
            .map { prod->
                prod.toModel()
            }
    }

}