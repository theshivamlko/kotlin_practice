package exercise

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    println("$secret   $guess")

    val rightPositions = secret.zip(guess).count { (f,s) -> f==s  }
    println("Right $rightPositions")

    val commonLetters = "ABCDEF".sumBy{ ch ->


        Math.min(secret.count { s -> ch == s }, guess.count { g -> ch == g })


    }
    println("commonLetters $commonLetters")

    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}