package com.example.kotlingiris1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        //Mantıksal

    }
}