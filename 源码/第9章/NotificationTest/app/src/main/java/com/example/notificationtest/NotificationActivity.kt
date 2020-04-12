package com.example.notificationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.string.cancel
import android.app.NotificationManager
import android.content.Context


class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
//        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        manager.cancel(1)
    }

}
