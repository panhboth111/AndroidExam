package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val startProgress = Thread({
        while(progressBar.progress<100){
            progressBar.progress+=10
            t.text = progressBar.progress.toString()
            Thread.sleep(100)
        }
    })
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(v:View){
        startProgress.start()
    }
}
