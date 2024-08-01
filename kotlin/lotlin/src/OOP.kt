class fruits{
    var name=""
    var color=""
    var shape=""
    var price=0
}

fun main(args: Array<String>) {
    val myObj=fruits()
    myObj.name="Oranges"
    myObj.color="yellow"
    myObj.shape="circle"
    myObj.price=20


    println("My favourite is ${myObj.name} and it costs ${myObj.price} kenyan shillings")
    val myobj=fruits()
    myobj.name="apple"
    myobj.color="red-greenish"
    myobj.shape="combination"
    myobj.price=30
    println("The other fruit that calms my nerves is ${myobj.name} , it is ${myobj.color} in color ; its average cost is ${myobj.price} and its rather awkward shape is ${myobj.shape}")

}
