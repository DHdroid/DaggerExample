package com.example.practice.network.service

import com.example.practice.network.model.post.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface SampleService {
    @GET("posts")
    fun getposts(): Call<List<PostResponse>>
}