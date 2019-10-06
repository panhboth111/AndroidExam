package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

    }
    override fun onStartTrackingTouch(p0: SeekBar?){
        musicPlayer.pause()
    }
    override fun onStopTrackingTouch(p0: SeekBar?) {
       musicPlayer.seekTo(dBar.progress)
        musicPlayer.start()
    }
    lateinit var musicPlayer:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        musicPlayer = MediaPlayer.create(this,R.raw.song1)
        dBar.setOnSeekBarChangeListener(this)
    }
    fun btn(v:View){
        var durationThread = Thread({
            dBar.max = musicPlayer.duration
            while (musicPlayer.isPlaying) dBar.progress = musicPlayer.currentPosition
        })
        if (v.id == R.id.start && !musicPlayer.isPlaying){
            musicPlayer.start()
            durationThread.start()
        }
        else if (v.id == R.id.pause) musicPlayer.pause()
        else{
            musicPlayer.stop()
            musicPlayer = MediaPlayer.create(this,R.raw.song1)
        }
    }
}
