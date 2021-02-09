fun main(args: Array<String>) {
    my@ for (i in 1..6) {
        for (j in 1..6) {
            if (i == 2 && j == 4)
                continue@my
            println("$i\t\t$j")
        }
    }
}