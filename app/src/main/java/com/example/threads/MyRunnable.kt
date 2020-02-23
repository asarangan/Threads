package com.example.threads

import android.os.SystemClock
import kotlinx.android.synthetic.main.activity_main.*

class MyRunnable: Runnable {

        //private val rtVals:RtVals
        override fun run() {
            println("myTag: Thread is Running")
            var i=0;
            while(i<4000){
                i++
            }
            MainActivity.runOnUiThread(java.lang.Runnable {
                msg.text = "Updated from other Thread"
            }
        }
    }