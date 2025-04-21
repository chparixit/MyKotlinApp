package com.example.kotlin


fun main() {
    // Immutable List
    val lst = listOf("one", "two", "three") // <-- 'listOf', not 'listof'
    println("Immutable list")               // <-- This should match the type of list
    for (i in lst.indices) {
        println(lst[i])
    }
    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Mutable list")                  // <-- This should match the type of list
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}