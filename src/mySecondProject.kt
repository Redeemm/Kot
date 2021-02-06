import java.util.*

//Write a Program to check the eligibility of an individual

fun main () {
    var i = 1
    do {
        print("YOUR NAME: ")
        readLine().toString()
        val read = Scanner(System.`in`)
        print("AGE: ")
        val myAge = read.nextInt()

        val n = 18
        when (myAge > n) {
            true -> println("You are eligible\n")
            else
            -> println("You are too young\n")
        }
        i++
    }while (i < 5)
}