open class parent{
    var dad="Likes watching football"
    var mum="Likes going shopping"
}
class daughter: parent(){
  fun da(){
      println("mum $mum")
  }

}
class son:parent(){
    fun son(){
        print("dad $dad")
    }

}

fun main(args: Array<String>) {
    val obj=daughter()
    obj.da()
    val obj2=son()
    obj2.son()
}