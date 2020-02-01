package com.example.practice.view.ui.main

import android.os.Bundle
import android.util.Log
import com.example.practice.R
import com.example.practice.network.model.post.PostResponse
import com.example.practice.network.service.SampleService
import com.example.practice.view.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject
    lateinit var sampleService: SampleService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var post = sampleService.getposts()

        post.enqueue(object: Callback<List<PostResponse>>{
            override fun onResponse(call: Call<List<PostResponse>>, response: Response<List<PostResponse>>) {
                textview1.text = response.body()?.get(0)?.title
            }

            override fun onFailure(call: Call<List<PostResponse>>, t: Throwable) {
                Log.d("Response : ", t.toString())
            }

        })
        setContentView(R.layout.activity_main)
    }
}
