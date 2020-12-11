package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

//重写app类轻松实现全局获取context
class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "Ua8rxzL86VpnGtSJ"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}