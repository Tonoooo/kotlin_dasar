// parameter yang berada diposisi terakhir, memiliki kemampuan dijadikan sebuah vararg
// varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam array

fun hitungtotal(nama: String, vararg nilaii: Int): Int{  //vararg harus diujung parameter
    var total = 0
    for (nilai in nilaii){
        total += nilai
    }
    return total
}

fun main() {
    println(hitungtotal("tono", 100, 50, 50))
}