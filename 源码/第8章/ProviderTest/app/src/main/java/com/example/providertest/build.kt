package com.example.providertest

fun <T> T.build(block: T.() -> Unit): T {
    block()
    return this
}