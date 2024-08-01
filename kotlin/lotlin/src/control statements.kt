fun main(args: Array<String>) {
    val age= 21
    if(age>=21){
        println("You are eligible to vote")
    }
    else{
        println("Sorry, you cant vote")
    }

    var num= 3
    if(num%2==0){
        println("$num is an even number")
    }
    else
    {
        println("$num is an odd number")
    }

    val marks=70
    if(marks>=80 && marks<=100){
        println("You've scored an A")
    }
    else if(marks>=60 && marks<=79){
        println("You've scored a B")
    }
    else if(marks>=40 && marks<=59){
        println("You've scored a C")
    }
    else if(marks>=0 && marks<=39){
        println("You are a faileeee")
    }
    else{
        println("Wrong input !!!!")
    }
}