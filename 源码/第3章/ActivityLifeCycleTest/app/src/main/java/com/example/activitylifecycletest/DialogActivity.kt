package com.example.activitylifecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_layout)
    }
}
