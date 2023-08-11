class Wanafunzi(val jina:String, var miaka:Int, var ID:Int){

}

fun main(args: Array<String>) {
    val mimi=Wanafunzi("Robert", 29, 15876)
    println("Student Name is: ${mimi.jina} , ${mimi.ID} and age is ${mimi.miaka}")
}