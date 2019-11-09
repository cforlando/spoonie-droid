package com.example.dailyspoonie

import android.app.Application
import io.realm.Realm

class DailySpoonieApp: Application() {
    init {
        singleton = this
        Realm.init(this)
    }

    public override fun onCreate() {
      super.onCreate();
    }

    companion object {
        var singleton : DailySpoonieApp? = null;
        fun getInstance() = singleton
    }

}

