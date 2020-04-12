package com.example.playvideotest

infix fun String.beginsWith(prefix: String) = startsWith(prefix)

infix fun <T> Collection<T>.has(element: T) = contains(element)

infix fun <A, B> A.with(that: B): Pair<A, B> = Pair(this, that)