package com.androchef.totellapp

import android.app.Application
import com.facebook.stetho.Stetho

/**
 Developed by Arnav 2021
 */
class MainApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}
