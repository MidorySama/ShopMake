package com.patycorona.shopmark.api

import android.database.Observable
import com.patycorona.shopmark.activities.Constant.Companion.QUERY_HITS
import com.patycorona.shopmark.models.ApiNewsHitsModel
import com.patycorona.shopmark.models.ManyProdResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CoreHomeApi {

    @GET("/api/v1/search_by_date")
    @Headers("Content-Type: application/json")
    fun getHits(
        @Query("query") query: String = QUERY_HITS,
        @Query("page") page :Int = 0
    ):Observable<ApiNewsHitsModel>


    @GET("/product")
    @Headers("Content-Type: application/json ")
    fun getProduct( ): Single<ManyProdResponse>

}