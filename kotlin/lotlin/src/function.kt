fun myclass(){
    var name="eMobilis"
    println("I learn coding at $name")
}
fun main(args: Array<String>) {
    myclass()
    addtwonumbers()
    students("tom","john", 45)
    students("Kayla","Mckenzie", 24)
    students("Jammie","O'brien",43)
}
fun addtwonumbers(){
    var num1=7
    var num2=9
    println("The sum of $num1 and $num2 is ${ num1 + num2} ")

}
fun students(fname:String,lname:String,age:Int){
    println("Student name is $fname $lname and he/she is $age years old")
}
