package com.tom.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Eric", 77, 99)
    val stu2 = Student("Jane", 60, 40)
    val stu3 = Student("Hank", 50, 30)
    val gstu = GraduateStudent("Jack", 55,65,60)
    gstu.print()
    stu.print()
    stu2.print()
    stu3.print()
    println("Highest score: ${stu.highest()}")
}

class GraduateStudent(name: String?,english: Int,math: Int,var thesis: Int) : Student(name,english,math){
    companion object{
        var pass =70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if(getAverage() >= pass) "Pass" else "Failed"
}

open class Student(var name : String?,var english :Int,var math : Int ) {
    companion object{
        @JvmStatic
        var pass = 60
    }
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    open fun passOrFailed() = if(getAverage() >= pass) "Pass" else "Failed"

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

