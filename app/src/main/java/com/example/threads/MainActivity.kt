package com.example.threads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.os.SystemClock.sleep
import android.util.Log
import java.lang.Runnable
import java.lang.Thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("myTag: Main")
        val myRunnable = MyRunnable()
        val myThread = Thread(myRunnable)
        myThread.start()
    }
}

