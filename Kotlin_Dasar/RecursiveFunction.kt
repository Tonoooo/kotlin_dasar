// Recursive Function adalah function yang memanggil function dirinya sendiri


fun main() {

    // looping biasa tanpa menggunakan Recursive Function
    fun inifactorialloop(nilai: Int): Int{
        var angka = 1
        for (i in nilai downTo 1){
            angka *= i
        }
        return angka
    }
    println(inifactorialloop(5))


    // ini yang menggunakan Recursive Function
    fun inifactorialrecursive(nilai: Int): Int{
        return when(nilai){
            1 -> 1
            else -> nilai * inifactorialrecursive(nilai - 1)
        }
    }
    println(inifactorialrecursive(5))
}
