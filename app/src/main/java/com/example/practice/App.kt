package com.example.practice

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import com.example.practice.di.DaggerAppComponent
import com.example.practice.di.NetworkModule

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .application(this)
            .networkModule(NetworkModule(BuildConfig.BASE_URL))
            .build()
}