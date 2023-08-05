package com.example.kotlingiris1

fun main(){
    //if
    /*
    if (kosul){
        //koşul sağlanirsa
    }
    else {
        //koşul sağlanmazsa
    }
    */
    /*
    var yas = 50
    if (yas < 20)
    {
      println(" < 20")
    }
    else if (yas >= 20 && yas < 60 ){
        println("20 - 60")
    }
    else
    {
        println(">= 20")
    }

     */

    //Bankacılık işlemlemlerinde eft işlemi yapılmak isteniyor.
    //İşlem yapılacak gün ve saat bilgisinin mesai günleri ve saatleri içinde olup olmamasına göre kullanıcının işlemin yapılabileceği en yakın zamanın bilgilendirmesinin yapılması
    /*
        var kullaniciIslemGunu = 2 // Haftanın günü 1.
        var kullaniciIslemSaati = 7

        if(kullaniciIslemGunu > 0 && kullaniciIslemGunu <= 2)
        {
            if (kullaniciIslemGunu <= 5)
           {
                if(kullaniciIslemSaati > 0 && kullaniciIslemSaati <= 24)
                {
                    if(kullaniciIslemSaati >= 9 && kullaniciIslemSaati < 18)
                    {
                         println("İşleminiz gerçekleştirilmiştir")
                    }
                    else
                    {
                        if(kullaniciIslemGunu == 5)
                        {
                            println("İşleminiz 2 sonra saat 9: 00 da gerçekleştirilecektir")

                        }
                        else{

                            println("İşleminiz yarın saat 9: 00 da gerçekleştirilecektir")
                        }
                    }

                }
                else
                    {
                    println("Geçersiz Saat")
                    }

           }
           else if(kullaniciIslemGunu == 6)
           {
               println("İşleminiz 2 sonra saat 9: 00 da gerçekleştirilecektir")

           }
            else{

                println("İşleminiz yarın saat 9: 00 da gerçekleştirilecektir")
               }
        }
        else{
            println("Geçersiz gün")
        }

     */

    //when-else
   /* when(deger){
        1 -> println("1")
    }


   var d =3
   when(d){
       1 -> println("1")
       2 -> println("2")
       3 ->
       {
           println("3")
       }
       in 1..5 ->
      {
       println("1-5")
      }
      !in 1..5 ->
      {
      println("değil")
      }
       else ->
       {
           println("else")
       }
   }
*/
    //Bankacılık işlemlemlerinde eft işlemi yapılmak isteniyor.
    //İşlem yapılacak gün ve saat bilgisinin mesai günleri ve saatleri içinde olup olmamasına göre kullanıcının işlemin yapılabileceği en yakın zamanın bilgilendirmesinin yapılması
/*
    var kullaniciIslemGunu = 6 //pazartesi 1.gün
    var kullaniciIslemSaati = 10

    when (kullaniciIslemGunu)
    {
       in 1..5 ->
       {
            when(kullaniciIslemSaati)
            {
               in 9..17 ->
               {
                   println("işleminiz yapılmıştır")
               }
               in 0..8 ->
               {
                   println("işleminiz bugün saat 9:00' da yapılacaktır")
               }
                in 18..24 ->
                {
                    when (kullaniciIslemGunu)
                    {
                        5 ->
                        {
                            println("işleminiz 3 gün sonra saat 9:00' da yapılacaktır")
                        }
                        else ->
                        {

                        }
                    }
                }
            }
       }
       6 ->
       {
           println("işleminiz 2 gün sonra saat 9:00' da yapılacaktır")
       }
       7 ->
       {
           println("işleminiz yarın saat 9:00' da yapılacaktır")
       }
    }

 */
    /*
    //while
    var sayac = 20
    while(sayac < 10)
    {
    sayac++
    println(sayac)
    }

    // do-while
    do
    {
    println(sayac)
    }
    while (sayac < 10)


     */
    /*
    //for
    for (i in 1..10){
        println(i)
    }
    for (i:Int in 1..3){
        println(i)
    }

     */
    /*
//continue
    for(i in 1..10){
        if(i == 5)
        {
            continue
        }
        println(i)
    }

     */
    var sayac = 4

    //break
    for(i in 1..100)
    {
        if( i in 1..10)
        {
            if (i == sayac)
            {
                break
            }
        }
    }
}




