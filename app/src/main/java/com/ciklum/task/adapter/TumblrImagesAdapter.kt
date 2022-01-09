package com.ciklum.task.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ciklum.task.R

class TumblrImagesAdapter(
    private val context: Context,
    private val imagesArray: ArrayList<String>,
    private val onItemCLicked: (Int) -> Unit
) : RecyclerView.Adapter<TumblrImagesAdapter.TumblrImagesViewHolder>() {

    class TumblrImagesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tumblrImage: ImageView = itemView.findViewById(R.id.tumblr_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TumblrImagesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)

        return TumblrImagesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TumblrImagesViewHolder, position: Int) {
        Glide.with(context).load(imagesArray[position]).override(500)
            .centerCrop()
            .into(holder.tumblrImage)

        holder.itemView.setOnClickListener { onItemCLicked(position) }
    }

    override fun getItemCount(): Int {
        return imagesArray.size
    }

}