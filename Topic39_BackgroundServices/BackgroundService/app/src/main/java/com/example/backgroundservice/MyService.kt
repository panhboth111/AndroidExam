package com.example.backgroundservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    lateinit var musicPlayer:MediaPlayer
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        musicPlayer = MediaPlayer.create(this,R.raw.song1)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        musicPlayer.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        musicPlayer.stop()
    }


}
