package com.patycorona.shopmark.views.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.load.engine.DiskCacheStrategy

//import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.patycorona.shopmark.R
import com.patycorona.shopmark.models.Prod

class ProdAdapter (
    private val dataSource: MutableList<Prod>,
    var onListHitItemClickListener:((prod:Prod)->Unit),
    val context: Context
    ): RecyclerView.Adapter<ProdAdapter.ViewHolder>()

{
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.tvName) as TextView
        var ImagePro: ImageView = view.findViewById(R.id.img_product) as ImageView
        var root:ConstraintLayout = view.findViewById(R.id.layout_Img_Prod) as ConstraintLayout
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup,viewType: Int): ViewHolder {
        val view =LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.img_producto,viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.name.text = dataSource[position].name
        viewHolder.ImagePro.setImageDrawable(context.getDrawable(dataSource[position].ImageProd))



        viewHolder.root.setOnClickListener{
            onListHitItemClickListener.invoke(dataSource[position])
        }

    }
    override fun getItemCount()= dataSource.size


}