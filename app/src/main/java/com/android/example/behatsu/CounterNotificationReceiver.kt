package com.android.example.behatsu

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.android.example.cameraxapp.Counter

class CounterNotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        val service = CounterNotificationService(context)
        service.showNotification(++Counter.value)
    }

}