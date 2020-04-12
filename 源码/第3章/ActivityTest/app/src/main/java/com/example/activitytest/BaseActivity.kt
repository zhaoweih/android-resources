package com.example.activitytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", javaClass.simpleName)
        ActivityBox.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityBox.removeActivity(this)
    }

}