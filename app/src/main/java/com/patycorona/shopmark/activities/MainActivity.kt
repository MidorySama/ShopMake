package com.patycorona.shopmark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.patycorona.shopmark.databinding.ActivityMainBinding
import com.patycorona.shopmark.models.Prod
import com.patycorona.shopmark.models.ProdResult
import com.patycorona.shopmark.viewmodel.ProdViewModel
import com.patycorona.shopmark.views.adapter.ProdAdapter
import androidx.recyclerview.widget.DefaultItemAnimator


import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    private val viewModelProd :ProdViewModel by viewModels()



    private val listProdObserver = Observer<ProdResult>{ prodResult->

        if (prodResult.sussess){
            prodResult.list?.let{
                val adapter = ProdAdapter(
                    it,
                    onItemClickListener,
                    applicationContext
                )
                binding?.recyclerView?.adapter = adapter
                adapter.notifyDataSetChanged()
            }

        }
    }

    private var onItemClickListener: ((prod: Prod) -> Unit) = { prod ->

        Toast.makeText(this, "Product:" + prod.name + " " +"Precio:$" + prod.precious, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initRecycler()
        initObserver()
        viewModelProd.getProd()
    }

    private fun initObserver() {
        viewModelProd.listProd.observe(this, listProdObserver)
    }


    private fun initRecycler()
    {
        val linearLayoutManager= LinearLayoutManager(this)
        binding?.recyclerView?.apply{
            layoutManager = linearLayoutManager
            isNestedScrollingEnabled = false
            setHasFixedSize(true)
            itemAnimator = DefaultItemAnimator()

        }
    }

}




