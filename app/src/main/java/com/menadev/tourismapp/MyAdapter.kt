package com.menadev.tourismapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newList: ArrayList<News>):
    RecyclerView.Adapter<MyAdapter.MyViewHOlder>()
{
    private lateinit var mListener:onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){

        mListener = listener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHOlder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item,parent,false)
        return MyViewHOlder(itemView,mListener)
    }


    override fun onBindViewHolder(holder: MyViewHOlder, position: Int) {
        val currentItem = newList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
        holder.tvLocation.text=currentItem.Location

    }

    override fun getItemCount(): Int {
        return newList.size
    }

    @Suppress("DEPRECATION")
    class MyViewHOlder(itemView:View, listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading: TextView =itemView.findViewById(R.id.tvHeading)
        val tvLocation:TextView=itemView.findViewById(R.id.tvLocation)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)

                }
            }



    }
}


