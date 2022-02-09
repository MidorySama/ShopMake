package com.patycorona.shopmark.repositories

import com.patycorona.shopmark.R
import com.patycorona.shopmark.models.Prod
import io.reactivex.Single
import javax.inject.Inject

class ProdRepository @Inject constructor()
{
    fun getProd(): Single<ArrayList<Prod>>    {
        var listProd:ArrayList<Prod> = arrayListOf()


        listProd.add(Prod(idproducto = 0, name = "Teléfono", precious = 2590.90, descuento = 15, ImageProd = R.drawable.ic_celular,stock = 6))
        listProd.add(Prod(idproducto = 1, name = "Refresco", precious = 25.50, descuento = 0, ImageProd = R.drawable.ic_refresco,stock = 8))
        listProd.add(Prod(idproducto = 2, name = "Leche", precious = 25.50, descuento = 0, ImageProd = R.drawable.ic_leche,stock = 10))
        listProd.add(Prod(idproducto = 3, name = "Topper", precious = 100.90, descuento = 0, ImageProd = R.drawable.ic_topper,stock = 4))
        listProd.add(Prod(idproducto = 4, name = "Pelota", precious = 50.90, descuento = 0, ImageProd = R.drawable.ic_pelota,stock = 15))
        listProd.add(Prod(idproducto = 5, name = "Vaso", precious = 10.50, descuento = 10, ImageProd = R.drawable.ic_vaso,stock = 50))
        listProd.add(Prod(idproducto = 6, name = "Licuadora", precious = 300.50, descuento = 0, ImageProd = R.drawable.ic_licuadora,stock = 6))
        listProd.add(Prod(idproducto = 7, name = "Calcetas", precious = 85.50, descuento = 0, ImageProd = R.drawable.ic_calcetas,stock = 25))
        listProd.add(Prod(idproducto = 8, name = "Blusa", precious = 250.50, descuento = 0, ImageProd = R.drawable.ic_blusa,stock = 9))
        listProd.add(Prod(idproducto = 9, name = "Zapato", precious = 450.50, descuento = 0, ImageProd = R.drawable.ic_zapato,stock = 35))
        listProd.add(Prod(idproducto = 10, name = "Platos", precious = 45.50, descuento = 0, ImageProd = R.drawable.ic_platos,stock = 20))

        return Single.just(listProd)
    }
}