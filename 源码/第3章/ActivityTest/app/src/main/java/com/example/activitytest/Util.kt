package com.example.activitytest

/**
 *
 *
 * @author guolin
 * @since 2019-05-14
 */
class Util {

    fun doAction1() {
        println("do action1")
    }

    companion object {

        @JvmStatic
        fun doAction2() {
            println("do action2")
        }

    }

}