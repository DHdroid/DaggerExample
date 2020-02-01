package com.example.practice.network.model.post

data class PostResponse(
    var id: Long,
    var userId: Long,
    var title: String,
    var body: String
)