package com.picpay.composePicpay

import android.app.Application
import com.picpay.composePicpay.di.componentModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(componentModule)
        }
    }
}