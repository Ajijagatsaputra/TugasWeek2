fun main() {
    var A = 40
    var B = 20
    //Operator Aritmatika
    var tambah = A + B
    var kurang = A - B
    var kali = A * B
    var bagi = A / B
    var modulus = A % B

//    println(tambah)
//    println(kurang)
//    println(kali)
//    println(bagi)
//    println(modulus)

//    //Operator Assigment
//    A += B
//    A -= B
//    A *= B
//    A /= B
//    A %= B
//    println(A)

//    //Operator Unary
//    var c = 100
//    c++
//    println(c)
//    var d = 100
//    d--
//    println(d)

    // Operator Perbandingan
//    var e = 60
//    var f = 50
//
//    var kurangdari = e < f
//    var kurangdarisamadengan = e <= f
//    var samadengan = e == f
//    var tidaksamadengan = e != f
//
//    println(kurangdari)
//    println(kurangdarisamadengan)
//    println(samadengan)
//    println(tidaksamadengan)
//
//    // Operator Logika
//    var g = 10 < 5 //false
//    var h = 20 > 10 //true
//    var and = g && h
//    var  or = g || h
//    var not = !g
//
//    println(and)
//    println(or)
//    println(not)

    // Pengkodisian If
    val examvalue = 70
    if (examvalue > 80){ //false
        println("Lulus")
    } else{
        println("Tidak lulus")
    }

    // buat apakah termasuk bilangan genap atau ganjil
//    var genap =  10
//    if(genap %2== 0){
//        println("Benar")
//    }else{
//        println("Salah")
//    }

    // else if
    if(examvalue > 80){
        println("Exelent")
    }else if(examvalue > 50){
        println("Good Job")
    }else{
        println("Keep spirit")
    }

    // when expressions
    var grade = 'F'
    when(grade){
        'A' -> println("Exelent")
        'B' -> println("Good Joob")
        'C' -> println("not bad")
        else -> println("Ups")
    }



}
