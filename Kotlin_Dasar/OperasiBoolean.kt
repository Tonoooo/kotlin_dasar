// OPERASI BOOLEAN
//   operator   |   keterangan
//      &&      |     dan
//      ||      |     atau
//      !       |    kebalikan

//  operator &&
// t && t = t, t && f = f, f && t = f, f && f = f
//  operator ||
// t || t = t, t || f = t, f || t = t, f & f = f

fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 80
    val apakahLulusujian = nilaiUjian > 75
    val apakahLulusabsen = nilaiAbsen > 75
    val apakahLulusextra = nilaiExtra > 75

    val apakahlulus = apakahLulusujian && apakahLulusabsen && apakahLulusextra
    println(apakahlulus)
}