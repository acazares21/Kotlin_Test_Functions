//Testing kotlin functions

fun main (){
    var variableA: String = "a"
    var variableB: String = "b"

    println("Hello World!!")
    println("\n"+evaluation(variableA, variableB)+"\n")

    //Kotlin things...
    println(evaluation(variableA=variableA)+"\n") //When some argument is missing you should do this
    println(evaluation(variableB=variableB)+"\n") //to catch the default argument.
}

//Function with default parameters returning a String
fun evaluation(variableA: String = "Ángel", variableB: String = "Cazares"): String {
    println(variableA)
    println(variableB)

    var resulA: String = "variableA $variableA"
    var resulB: String = "variableB $variableB"

    return "La variable a es: $resulA\nLa variable b es: $resulB"
}

//For more information about this, please visit the following link
//https://developer.android.com/codelabs/basic-android-kotlin-compose-functions?hl=es-419#7