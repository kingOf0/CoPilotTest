import java.util.*

//make a number precision game
fun main() {
    val number = Random().nextInt(100) + 1
    var guess = 0
    var guessCount = 0
    while (guess != number) {
        guess = readLine()!!.toInt()
        guessCount++
        if (guess > number) {
            println("Lower")
        } else if (guess < number) {
            println("Higher")
        }
    }
    println("You guessed it in $guessCount guesses")
}