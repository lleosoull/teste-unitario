package com.project.test.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.test.R
import com.project.test.adapter.core.GenericAdapter
import com.project.test.holders.AuctionHolder
import com.project.test.model.Auction

class AuctionAdapter(
    private val auctionList: List<Auction> = emptyList()
) : GenericAdapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AuctionHolder(inflate(R.layout.inflate_auction_item, parent))
    }

    override fun getItemCount(): Int = auctionList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as AuctionHolder).build(auctionList[position], context)
    }
}