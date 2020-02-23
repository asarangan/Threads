package com.example.threads

import android.os.SystemClock

class MyRunnable: Runnable {

        //private val rtVals:RtVals
        override fun run() {
            println("myTag: Thread is Running")
            for (i in 1..10) {
                SystemClock.sleep(500)
                println("myTag: Number is = "+i)
                //rtVals.code = 1
            }
            //myTask.retcode = 2
            println("myTag: Thread has ended")
        }
    }