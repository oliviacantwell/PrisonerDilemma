import java.awt.Choice
import java.util.*

class Game{

    private var opponentScore = 0
    private var playerScore = 0

    fun opponentChoices(): Int {

    //randomly generates opponent's choice
    val steal = 1
    val split = 2

    return (steal..split).random()
    }

    fun playerChoices(): Char {
        println("Enter 's' for split or 't' for steal")
        val scanner = Scanner(System.`in`)
        var playerChoice = scanner.next().single().lowercaseChar()

        //makes sure you put the right choice...
        while (playerChoice.lowercaseChar() != 's' && playerChoice.lowercaseChar() != 't'){
            println("Please Enter a valid choice")
            playerChoice = scanner.next().single().lowercaseChar()
        }
        return playerChoice
    }

    fun playerScore(addNum1: Int): Int {

        //adds any points you got to your total score
        print("And you got $addNum1 ")
        playerScore += addNum1
        println("for a total of $playerScore")
        return playerScore
    }

    fun opponentScore(addNum2: Int): Int {

        //adds any points opponent got to their total score
        print("Your opponent got $addNum2 ")
        opponentScore += addNum2
        println("for a total of $opponentScore")
        return opponentScore
    }

    fun calcOutcome(opponentChoice: Int, playerChoice: Char) {
        if (opponentChoice == 1)
            println("Your opponent chose steal!")
        else
            println("Your opponent chose split!")

        //figures out what choices everyone made and calls the functions to add to the scores
        when {
            opponentChoice == 2 && playerChoice == 's' -> opponentScore(50) and playerScore(50)
            opponentChoice == 2 && playerChoice == 't' -> opponentScore(0) and playerScore(100)
            opponentChoice == 1 && playerChoice == 's' -> opponentScore(100) and playerScore(0)
            opponentChoice == 1 && playerChoice == 't' -> opponentScore(0) and playerScore(0)
        }
    }

    fun roundCount() {
        var round = 1
        val scanner = Scanner(System.`in`)
        println("How many rounds do you want to play?")
        var rounds: Int = scanner.nextInt()

        while (round <= rounds)
        {
            println("\nRound $round")
            var opponentChoice = opponentChoices() //gets opponent's choice
            var playerChoice = playerChoices() //gets your choice
            calcOutcome(opponentChoice, playerChoice) //adds up scores
            round++
        }
    }

    fun winner() {

        //compares the scores and declares the winner
        println("\nGame Over!")
        println("Your score: $playerScore")
        println("Your opponent score: $opponentScore")

        when {
            opponentScore > playerScore -> println("You lost...")
            opponentScore < playerScore -> println("You win!!")
            opponentScore == playerScore -> println("It's a tie!")
        }
    }

}

fun main () {

    var g = Game()
    g.roundCount()
    g.winner()
}