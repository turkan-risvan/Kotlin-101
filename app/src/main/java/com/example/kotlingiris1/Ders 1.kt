package com.example.kotlingiris1

fun main(){
    val degiskenAdi = 5

    //Sayısal
    //TamSayı
    //Integer
    var d1 : Int
    d1 = 8
    println("$degiskenAdi")
    println(d1)
    //Kesirli
    var d2 : Float = 12.5f
    var d3 : Double = 18.0
    println(d2)
    println(d3)

    //Metinsel

    var d4 : String = "Metin"
    var d5 : String = "içerik"
    println(d4)

    var d6 : String =  d4 +" "+ d5
    println(d6)

    //Mantıksal
    var d7 : Boolean = true
    d7 = false
    d7 = 3 < 5
    println(d7)

    //Açıklama

    /*

     */

    var ad = "Ad : " + "\t\"Ahmet\'"
println(ad)

    //Aritmetik Operatörler
    // + - / *
    var d8 : Int = 56
    var d9 :Int = 43
    var toplam = d8 + d9
    println(toplam)

    var bolum = d8 / d9
    println(bolum)

    // % mod = kalan
    var kalan = 5 % 3

    var sayac = 0
    sayac = sayac +1
    sayac ++
    sayac --

    //Mantıksal
    // < <= >= == != && || !

    var d10 : Boolean = 3<5
    d10 = 3<=5
    d10 = 5 != 5
    println(d10)

    //&&
    // true &&  true  = true
    // false && true  = false
    // true && false = false
    // false && false = false

    d10 = true

    var veSonuc = 2>1 && d10

    println(veSonuc)

    // ||
    // true ||  true  = true
    // false || true  = true
    // true || false = true
    // false || false = false

    d10 = false

    var veyaSonuc = 2>1 || d10
    println(veyaSonuc)

    var d11 : Int = 10
    var d12 = 3

    var toplamSonuc : Float = d11.toFloat() / d12

    println(toplamSonuc)

    var d13 = "14"
    var d14 = d13.toInt()

    println(d14)
    var (a,b) = Pair(1,3.4)
    println(a)
    println(b)

    //Nullability
    var yasN : Int? = null
    yasN = 12
    println(yasN)

    var d16 = yasN!! * 10
    println(d16)

}
