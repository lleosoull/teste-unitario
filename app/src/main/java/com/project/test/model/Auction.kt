package com.project.test.model

class Auction {

    var message: String = ""
    var listBid: List<Bid> = emptyList()

    var biggerBid = Double.NEGATIVE_INFINITY
    var smallerBid = Double.POSITIVE_INFINITY

}