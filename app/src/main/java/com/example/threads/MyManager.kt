package com.example.threads

import android.os.Handler
import android.os.Looper
import android.os.Message

object MyManager {
    private val handler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(inputMessage: Message) {
            val myTask = inputMessage.obj as MyTask
        }
    }
}

