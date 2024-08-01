//for loop
fun main(args: Array<String>) {
    var my_array= arrayOf("Toyota","Mazda",'t',56,"mercedes")
    for (i in my_array){
        println("print $i")
    }
//range
for (x in 5..15){
    println("Range is $x")
}
    println("Gimme a language")
    val language= readln()
    for (e in language){
        println(e)
    }
    val num=23
    when(num) {
       in 1..9 -> println("Num is a one digit")
       in 10..99 -> println("Num is a two digit")
       in 100..999 -> println("Num is a three digit number")

        else-> println("Num is larger")
    }



}