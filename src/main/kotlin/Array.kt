fun main() {
//    val buah: Array<String> = arrayOf("mangga","pisang","alpukat")
//    println(buah.size)
//    println(buah.get(0))
//    println(buah[0])
//    buah.set(0 , "durian")
//    buah[1] = "anggur"
//    println(buah[0])
//    println(buah[1])
//
//    val arrayNuls: Array<Any?> = arrayOfNulls(2)
//    arrayNuls.set(0 ,"kelapa")
//    arrayNuls[1] = null
//
//    println(buah.toList())
//
//    // buat array bertipe integer dengan values 1-10, lalu cetak index terakhirnya
//    val angka: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
//    println(angka.size-1)
//    println(angka.filter { it>2 })
//
    // menggunakan lambda exspresion
    val array1 = Array<Int>(5){it+2}
    println(array1.toList())

//    // menggunakan Collection
//    val myList : ArrayList<String> = arrayListOf("saya","dia")
//    myList [0] = "kamu"
//    myList.forEach { println(it) }

    // menggunakan Range untuk menampilkan angka misal dari 1 sampai 10
    // bisa menggunakan 1..10 atau 1 until 10
//    val myRange = 1..10
//    println(myRange.toList())
//    // kebalikan menampilkan angka 10 sampai 1
//    val downTo = 10 downTo 1
//    println(downTo.toList())





}