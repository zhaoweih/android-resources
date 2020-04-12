package com.example.networktest

interface HttpCallbackListener {
    fun onFinish(response: String)
    fun onError(e: Exception)
}