fun main() {
    // membuat variabel yg berisi array integer
    // cetak setiap angka genap yg ada dimana angka genap pertama adalah 6

    var angka  = Array<Int>(10){it*2+6}
    println(angka.toList())

}