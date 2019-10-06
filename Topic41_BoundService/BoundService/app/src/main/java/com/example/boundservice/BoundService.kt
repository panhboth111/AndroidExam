package com.example.boundservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.view.View
import android.widget.Toast

class BoundService : Service() {
    private val myBinder = MyBinder()
    private var money = "1000$"
    override fun onBind(p0: Intent?): IBinder? {
        return myBinder
    }
    fun getMoney():String{
        return money
    }
    inner class MyBinder:Binder(){
        fun getService():BoundService{
            return this@BoundService
        }
    }
}
