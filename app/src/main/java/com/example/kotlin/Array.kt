package com.example.kotlin



fun main(args: Array<String>) {
    // Working with simple arrays
    var age = arrayOf(1, 2, 3)
    println(age.contentToString()) // To print array nicely
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("*****************************")

    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "sandis" // updating second element
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])
    println(name.size)

    println("*****************************")

    // Working with ArrayList
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20) // index first, then element
    age1.add(5)
    println("age1: $age1")

    // We can add values directly during initialization
    var age2 = arrayListOf<Int>(1, 20, 5)
    println("age2: $age2")

    var nameList = arrayListOf<String>("sandis", "ram", "shyam")
    nameList.add("hari")             // Add at the end
    nameList.add(4, "Sita")           // Add at specific index
    nameList.remove("shyam")          // Remove element by value
    nameList.removeAt(0)              // Remove element by index
    println(nameList)

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}