class computer{
    var brand=""
    var price=0
    var specs=""
}

fun main(args: Array<String>) {
    val myobj=computer()
    myobj.brand="Hewlett Packard"
    myobj.price=80000
    myobj.specs="Core i7 512 ssd 16GB RAM"
    println("My laptop is ${myobj.brand} it has a ${myobj.specs} and costs Ksh.${myobj.price}")
}