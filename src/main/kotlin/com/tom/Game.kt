package com.tom

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret){
        print("Please enter a number: ")
//        number = scanner.nextInt();
        number = readLine()!!.toInt()
        if (number > secret){
            println("Lower")
        }else if (number < secret){
            println("Higher")
        }else{
            println("Great,the number is $number")
        }
    }

}