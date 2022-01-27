package com.patycorona.shopmark.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.patycorona.shopmark.R
import com.patycorona.shopmark.databinding.ActivityMainBinding
import com.patycorona.shopmark.models.Prod
import com.patycorona.shopmark.views.Adapter.ProdAdapter


class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    var listproducto :ArrayList<Prod> = arrayListOf()

//Callbak

    private var onItemClickListener:((prod:Prod)->Unit) = { prod->
        Toast.makeText(this, "" + prod.name + "" + "" + prod.precious,Toast.LENGTH_SHORT ).show()
       // Product:Precious: $
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initRecycler()
        createData()
        setAdapter()
    }


    private fun initRecycler()
    {
        val linearLayoutManager= LinearLayoutManager(this)
        binding?.recyclerView?.apply{
            layoutManager = linearLayoutManager
            isNestedScrollingEnabled = false
            setHasFixedSize(true)

        }
    }

    private fun createData()
    {
        listproducto.add(Prod(idproducto = 0, name = "Teléfono", precious = 2590.90, descuento = 15, ImageProd = R.drawable.ic_celular,stock = 6))
        listproducto.add(Prod(idproducto = 1, name = "Refresco", precious = 25.50, descuento = 0, ImageProd = R.drawable.ic_refresco,stock = 8))
        listproducto.add(Prod(idproducto = 2, name = "Leche", precious = 25.50, descuento = 0, ImageProd = R.drawable.ic_leche,stock = 10))
        listproducto.add(Prod(idproducto = 3, name = "Topper", precious = 100.90, descuento = 0, ImageProd = R.drawable.ic_topper,stock = 4))
        listproducto.add(Prod(idproducto = 4, name = "Pelota", precious = 50.90, descuento = 0, ImageProd = R.drawable.ic_pelota,stock = 15))
        listproducto.add(Prod(idproducto = 5, name = "Vaso", precious = 10.50, descuento = 10, ImageProd = R.drawable.ic_vaso,stock = 50))
        listproducto.add(Prod(idproducto = 6, name = "Licuadora", precious = 300.50, descuento = 0, ImageProd = R.drawable.ic_licuadora,stock = 6))
//        listproducto.add(Prod(idproducto = 7, name = "Calcetas", precious = 85.50, descuento = 0, ImageProd = R.drawable.ic_calcetas,stock = 25))
//        listproducto.add(Prod(idproducto = 8, name = "Blusa", precious = 250.50, descuento = 0, ImageProd = R.drawable.ic_blusa,stock = 9))
//        listproducto.add(Prod(idproducto = 9, name = "Zapato", precious = 450.50, descuento = 0, ImageProd = R.drawable.ic_zapato,stock = 35))
//        listproducto.add(Prod(idproducto = 10, name = "Platos", precious = 45.50, descuento = 0, ImageProd = R.drawable.ic_platos,stock = 20))

    }

    private fun setAdapter()
    {
        val adapter = ProdAdapter(

            listproducto,
            onItemClickListener,
        this)
      

        binding?.recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()


    }

}




