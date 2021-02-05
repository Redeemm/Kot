import java.util.*

//Write a Program to check the eligibility of an individual

fun main () {
    var i: Int = 1
    do {
        print("YOUR NAME: ")
        var myName = readLine().toString()
        var read = Scanner(System.`in`)
        print("AGE: ")
        var myAge = read.nextInt()

        val n: Int = 18
        when (myAge > n) {
            true -> println("You are eligible\n")
            else
            -> println("You are too young\n")
        }
        i++
    }while (i < 5)
}