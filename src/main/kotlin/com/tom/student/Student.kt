package com.tom.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("Tom", 77, 99)
    stu.print()
    println("Highest score: ${stu.highest()}")
}

class Student(var name : String?,var english :Int,var math : Int ) {
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun passOrFailed() = if(getAverage() >= 60) "Pass" else "Failed"

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english+ math)/2
    fun highest() = if(english > math)english else math

    fun nameCheck() = name?.length
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    //var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()

    print("Please enter student's math: ")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

