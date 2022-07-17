package com.example.kotrinpractice

fun main(){
    helloWorld()
}

fun helloWorld(): Unit{
    println("hello world!")
}
// 조건
fun maxBy(a: Int, b:Int) :Int {
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a:Int, b:Int):Int = if(a>b) a else b
fun checkNum(score:Int) {
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }
    var b:Int = when(score){
        1->1
        2->2
        else -> 3
    }
    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("ok~")
    }
}