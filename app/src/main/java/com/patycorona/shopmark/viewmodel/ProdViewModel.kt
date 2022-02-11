package com.patycorona.shopmark.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.patycorona.shopmark.models.ProdResult
import com.patycorona.shopmark.repositories.ProdRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class ProdViewModel @Inject constructor(
   var prodRepository: ProdRepository ): ViewModel() {

    // Ayuda a liberar los recuros cuando uzamos programacion reactiva
    private val compositeDisposable = CompositeDisposable()

    val listProd: MutableLiveData<ProdResult> by lazy {
        MutableLiveData<ProdResult>()
    }

    fun getProd() {
        compositeDisposable += prodRepository.getProducts()
            .subscribeOn(Schedulers.io())
            .subscribe({ listProds ->
                listProd.postValue(
                ProdResult(
                    sussess = true,
                    list = listProds
                )
            )
        },{
            listProd.postValue(
                ProdResult(
                    sussess = false
                )
            )
        })
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}










