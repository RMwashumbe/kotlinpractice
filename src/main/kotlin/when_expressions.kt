fun main(args: Array<String>) {
    var ch='b'
    val num1=45
    when(ch){
        'a'-> println("a IS A Vowel")
        'e'-> println("e IS A Vowel")
        'i'-> println("i IS A Vowel")
        'u'-> println("u IS A Vowel")

        else -> println("$ch is a consonant")
    }
    when(num1){
        in 1..9 -> println("Its a single digit no")
        in 10..99 -> println("Its a double digit no")
        in 100..999 -> println("Its a triple digit no")
        else -> println("Has more than three digits")
    }
}