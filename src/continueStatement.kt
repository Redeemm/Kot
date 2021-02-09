
fun main (args: Array<String>) {
//    val read= Scanner(System.`in`)
//    val a = read.nextInt()
//    val b = read.nextInt()
//    val c = read.nextInt()
    for (G in 1..5) {
        myLoop@ for (j in 'A'..'Z') {
            for (k in 'A'..'Z') {
                for (l in 'A'..'Z') {
                    println("=>\t $j $k $l")
                    if (j == 'R' && k == 'E' && l == 'D') {
                        break@myLoop
                    }
                }
            }
        }

    }
}
