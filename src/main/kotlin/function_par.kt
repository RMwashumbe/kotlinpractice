fun getfullname(firstname:String,lastname:String=""):String{
    return if (lastname.isNotEmpty()){
        "$firstname $lastname"
    }else{
        firstname
    }
}
fun calculatescore (correctanswer:Int,totalquestion:Int):Int{
    return (correctanswer * 100) / totalquestion
}
fun main(args: Array<String>) {
//    lambda function
    val sum = {num1:Int,num2:Int ->num1+num2}

    println("20+7 : ${sum(20,7)}")
    val stud1=getfullname( "Robert","Mwashumbe")
    println(stud1)
    val correctanswer=8
    val totalquestions=10
    val score= calculatescore (correctanswer,totalquestions)
    println("Your score is : $score")
}
//create a function that displays a complex calculator using input/output concepts