package com.example.kotlin



fun main() {
    print("Hello World")

    // mutable
    // we can reassign values of mutalble variables
    var age=20;
    age=20;

    //immutable
    // we cannot reassign the vaues of immutables variables
    val roll=15;
//    roll=10;

    var a : Boolean = true
    var b : Char= 'R'
    var c : Byte= 12
    var d : Short =-365
    var e : Int = 43543
    var f : Long =-474638384L
    var i : Float=5.34342342F
    var h: Double =7.4354325435435

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    var x : Double= 143.33
    var y : Int= x.toInt()
    var z : Byte =y.toByte()


    var l : String ="Hello World"
    var m : Int= l.length
    var n: Boolean= l.equals("Hello World")
    var username: String ="Softwarica"

    println(username.trim())
    println(l)
    println(m)
    println(l.isEmpty())
    println(l.lowercase())
    println(l.uppercase())
    println(n)
    print(l.plus(",How are you?"));





}