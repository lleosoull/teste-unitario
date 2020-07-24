package com.project.test.holders

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.test.R
import com.project.test.model.Auction
import com.project.test.ui.AuctionBidsActivity

class AuctionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val ivPictures: ImageView = itemView.findViewById(R.id.ivAuctionPictures)
    private val tvMessage: TextView = itemView.findViewById(R.id.tvAuctionMessage)
    private val tvPrice: TextView = itemView.findViewById(R.id.tvAuctionPrice)

    fun build(auction: Auction, context: Context) {

        tvMessage.text = auction.message
        tvPrice.text = auction.biggerBid.toString()

        itemView.setOnClickListener {
            val intent = Intent(context, AuctionBidsActivity::class.java)
            context.startActivity(intent)
        }
    }

}