package com.example.multimodulemvvm.ui.fragments.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.load
import com.example.domain.model.TvShow
import com.example.multimodulemvvm.R

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    var tvShows: List<TvShow>? = null
    var onItemClick: ((TvShow?) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        val item = tvShows?.get(position)
        holder.apply {
            clHomeItem.setOnClickListener {
                onItemClick?.invoke(item)
            }
            ivMovie.load(item?.poster_path)
        }
    }

    override fun getItemCount(): Int {
        return tvShows?.size ?: 0
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val clHomeItem = itemView.findViewById<ConstraintLayout>(R.id.cl_home_item)
        val ivMovie = itemView.findViewById<ImageView>(R.id.iv_movie)
    }

}