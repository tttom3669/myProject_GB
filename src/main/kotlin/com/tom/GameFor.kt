package com.tom

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for(i in 1..4){
        print("Please enter a number(${i}/4): ")
        var number = scanner.nextInt()
        println("第${i}次: $number")
        if (number > secret){
            println("Lower")
        }else if (number < secret){
            println("Higher")
        }else{
            println("Great,the number is $secret")
            break
        }
        if (number == -1) break
    }
}