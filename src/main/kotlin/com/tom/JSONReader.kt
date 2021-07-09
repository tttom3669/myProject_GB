package com.tom

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://pastebin.com/raw/UYV7UDuY")
    println(url.readText())
    /*with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach() {
            println(it)
        }
    }*/

    /*val collection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(collection.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line !=null){
    json.append(line)
    line = br.readLine()
    }
    println(json.toString())*/
}