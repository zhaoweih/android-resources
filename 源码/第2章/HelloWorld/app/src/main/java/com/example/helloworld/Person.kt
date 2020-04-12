package com.example.helloworld

open class Person(val name: String, val age: Int) {

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }

}