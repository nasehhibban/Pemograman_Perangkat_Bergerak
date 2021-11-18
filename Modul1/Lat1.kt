fun main(args: Array<String>) {

// variabel Static
val valString ="ini String"
val valInt = 123

// variabel dinamis
var varString = "Madang"
var varInt = 789

//TipeData
//secara manual
var varmString : String = "Sebuah kata"

//tipedata referensi
//var kelas : Kelas

var penggabunganStr = "Angka ${1 + 5}"
println(penggabunganStr)

var gabungStr = "Angka $varInt"
println(gabungStr)

varString = "ubah"

println(varString)
print("Hello World")
println("Hello world!")
}