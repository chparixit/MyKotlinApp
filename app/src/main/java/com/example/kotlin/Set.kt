package com.example.kotlin


fun main() {
    val numbers = setOf(1, 2, 3, 4) // Capital 'O' in setOf
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1) // Variable names can't have spaces!
    println("The sets are equal: ${numbers == numbersBackwards}")
}