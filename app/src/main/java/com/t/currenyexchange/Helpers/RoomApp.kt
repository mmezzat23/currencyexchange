package com.t.currenyexchange.Helpers

import android.app.Application
import com.t.currenyexchange.Interfaces.AppDatabase

class RoomApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getAppDatabase(this); //--AppDatabase_Impl does not exist
    }
}