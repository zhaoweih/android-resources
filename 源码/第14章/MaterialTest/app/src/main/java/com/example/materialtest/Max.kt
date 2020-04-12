package com.example.materialtest

import java.lang.RuntimeException

fun main() {
    val a = 3.5
    val b = 3.8
    val c = 4.1
    val largest = max(a, b, c)
    println(largest)
}

fun <T : Comparable<T>> max(vararg nums: T): T {
    if (nums.isEmpty()) throw RuntimeException("Params can not be empty.")
    var maxNum = nums[0]
    for (num in nums) {
        if (num > maxNum) {
            maxNum = num
        }
    }
    return maxNum
}