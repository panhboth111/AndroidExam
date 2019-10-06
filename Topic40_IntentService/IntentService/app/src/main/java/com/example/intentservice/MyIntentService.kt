package com.example.intentservice

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast

class MyIntentService : IntentService("MyIntentService") {
    lateinit var musicPlayer: MediaPlayer
    override fun onHandleIntent(p0: Intent?) {
        musicPlayer = MediaPlayer.create(this,R.raw.song1)
        musicPlayer.start()
    }

}
