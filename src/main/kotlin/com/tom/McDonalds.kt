package com.tom.kotlin

import java.io.File

fun main() {
    val mc = McDonalds()
    mc.printmenu()
    println(mc.menu["201"])

}

class McDonalds (){
    val file = File("mcdonalds.txt").bufferedReader().lines()
    var menu = HashMap<String,Item>()

    fun printmenu(){
        file.forEach{
            val token = it.split(",")
            val item = Item(
                token[0],
                token[1],
                token[2].toInt(),
                token[3].toInt())
            menu[item.id] = item
            println(it)
        }
    }

}
data class Item(val id: String, val name: String, val calorie: Int, val price: Int)
