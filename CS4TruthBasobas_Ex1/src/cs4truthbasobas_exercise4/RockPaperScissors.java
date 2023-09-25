package cs4truthbasobas_exercise4;

import java.util.Scanner;
/**
 * 
 * @author Alessandra Basobas
 */

public class RockPaperScissors {

public static void main(String[] args){
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        int playerScore = 0;
        int computerScore = 0;
        
        while (true){
        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: ");
        Scanner sc = new Scanner(System.in);    
        System.out.println( "1. Start game ");
        System.out.println( "2. Change number of rounds ");
        System.out.println( "3. Exit application " );
        int answer = sc.nextInt();
        
        switch (answer) {
            case 1:
            System.out.println("\nThis match will be first to " + roundsToWin + " wins."); 
            
            while (playerScore!=roundsToWin && computerScore!=roundsToWin){
            System.out.println( "The computer has selected its move. Select your move: ");
            System.out.println("1. Rock ");
            System.out.println("2. Paper ");
            System.out.println("3. Scissors ");    
        
            //Gets input from user
            int pM = sc.nextInt(); 
            Move playerMove = null;
            
                switch(pM){
                    case 1:
                        playerMove = rock;
                        break;
                    case 2:
                        playerMove = paper;
                        break;
                    case 3:
                        playerMove = scissors;
                        break;
                }
                
            //Computer chooses random number
            int random = (int) Math.floor(Math.random()*3)+1;
            //Gets input from computer
            Move computerMove = null;
            
            switch(random){
                case 1:
                computerMove = rock;
                break;
                case 2:
                computerMove = paper;
                break;
                case 3:
                computerMove = scissors;
                break;
            }

            System.out.print("Player chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". ");
            
            int winner;
            winner = Move.compareMoves(playerMove, computerMove);
            
            switch(winner){
                case 0:
                    System.out.println("Player wins round!");
                    playerScore++;
                    break;
                case 1:
                    System.out.println("Computer wins round!");
                    computerScore++;
                    break;
                case 2:
                    System.out.println("Round is tied!");
                    break;
            }
            
            System.out.println("Player: " + playerScore + " - Computer: " + computerScore + "\n");
            }
           
            if (playerScore == roundsToWin) {
                System.out.println("Player Wins!\n");
            }
            else {
                System.out.println("Computer Wins!\n");       
            }
            break;
           
        case 2:
            System.out.println("\nHow many wins are needed to win a match?");
            roundsToWin = sc.nextInt();
            System.out.println("New setting has been saved!\n");
            break;
        
        case 3:
            System.out.println("Thank you for playing! See you again.");
            System.exit(0);
            break;
        
        default: 
            System.out.println("Please input a valid number from 1-3.");
        }    
    }
  }
}
