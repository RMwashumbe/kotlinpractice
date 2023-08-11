class People(val name:String,val age:Int,val gender:String){
    // member function for intro
    fun jitambulishe(){
        println("Hi my name is $name and I'm $age year old $gender")
    }
    // member function to have birthday
    fun havebirthday(){
        //age++
        println("$name just turned $ $age")
    }
}

fun main(args: Array<String>) {
    //create an instance for the class
    val watu=People("John", 45,"Male")
    val watu1=People("Robert", 29, "Male")
    val watu2=People("Stephen", 34, "Male")
    val watu3=People("Terry", 45, "Female")

    watu.jitambulishe()
    watu.havebirthday()

    watu1.jitambulishe()
    watu1.jitambulishe()

    watu2.jitambulishe()
    watu2.jitambulishe()

    watu3.havebirthday()
    watu3.havebirthday()
}