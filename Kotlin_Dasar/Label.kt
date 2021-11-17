// label adalah penanda.
// senua expression dikotlin bisa ditandai dengan label.
// untuk membuat label dikotlin, cukup menggunakan nama label lalu diikuti dengan karakter @ tanpa sepasi.
// salah satu kegunaan label adalah bisa diintegrasikan dengan break, continue, dan return.

// biasanya break, continue dan return hanya bisa menghentikan proses diblok-
// kode tempat mereka berada, namun dengan menggunakan label, kita bisa-
// menentukan ke label mana kode akan berhenti


// labeldenganbreak
fun labeldenganbreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

// labeldengancontinue
fun labeldengancontinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main() {

    //  label dengan return
    fun test(nama: String, operasi: (String) -> Unit): Unit = operasi(nama)
    test("") test@{
        if (it == ""){
            return@test
        }else{
            println("tono")
        }
    }

}