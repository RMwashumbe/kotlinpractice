open class Animal(val name:String){
open fun makesound(){
        println("$name makes a sound")
    }
}
class Cat(name: String):Animal(name){
    override fun makesound(){
        println("$name meows")
    }
}
class Dog(name:String):Animal(name){
   override fun makesound(){
        println("$name barks")
    }
}
class Cow(name: String):Animal(name){
    override fun makesound(){
        println("$name moos")
    }
}
fun main(args: Array<String>) {
    val dog=Dog("Buddy")
    val cat=Cat("Whiskers")
    val cow=Cow("Cow")

    dog.makesound()
    cat.makesound()
    cow.makesound()
}