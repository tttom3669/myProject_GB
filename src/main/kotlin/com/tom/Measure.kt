package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter = 1
    var counterc = 1
    var ms = measureTimeMillis {
        for (i in 1..100_100){
            thread {
                counter++
            }
        }
    }
    var msc = measureTimeMillis {
        for (n in 1..100_000){
            GlobalScope.launch {
                counterc++
            }
        }
    }

    println(ms)
    println(msc)
}