package com.danl.shikimori

import android.app.Application
import com.danl.shikimori.di.DaggerApplicationComponent

@Suppress("unused")
class ShikimoriApplication: Application() {

    val appComponent = DaggerApplicationComponent.create()

}