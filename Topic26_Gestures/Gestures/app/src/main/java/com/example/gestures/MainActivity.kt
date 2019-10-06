package com.example.gestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    override fun onShowPress(p0: MotionEvent?) {
        textView.text = "Show press"
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        textView.text = "Single tap up"
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        textView.text = "Down"
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        textView.text = "fling"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        textView.text = "scroll"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        textView.text = "long press"
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        textView.text = "double tap"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        textView.text = "double tap event"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        textView.text = "confirmed"
        return true
    }
    var gDetector:GestureDetector? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gDetector = GestureDetector(this,this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}
