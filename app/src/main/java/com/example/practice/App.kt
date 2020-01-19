package com.example.practice

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import com.example.practice.di.DaggerAppComponent

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .application(this)
            .build()
}