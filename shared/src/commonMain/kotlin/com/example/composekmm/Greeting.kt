package com.example.composekmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}