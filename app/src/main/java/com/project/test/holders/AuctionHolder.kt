package com.project.test.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.test.R

class AuctionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val ivAuctionPictures: ImageView = itemView.findViewById(R.id.ivAuctionPictures)
    private val tvAuctionMessage: TextView = itemView.findViewById(R.id.tvAuctionMessage)
    private val tvAuctionPrice: TextView = itemView.findViewById(R.id.tvAuctionPrice)

    fun build() {

    }

}