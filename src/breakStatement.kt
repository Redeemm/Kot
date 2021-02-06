import java.util.*

//    The multiples of number
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    print("\nTYPE THE NUMBER OF TERMS YOU WANT: ")
    val n = read.nextInt() // The number of terms in multiplication
    print("\nTYPE THE NUMBER OF ITERATION YOU WANT: ")
    val j = read.nextInt() // The max-number of iterations

    var i = 1 // The number of iteration
    var k: Int // Variable to answer the question
    do{
        print("\n$i.\t$n * $i = ")
        k =read.nextInt()
        if (k != n*i) {
            print("\nYou are Wrong!!")
            break
        }
        i++
    } while (i <= j)
}