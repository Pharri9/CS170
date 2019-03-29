/*Patrick Harris
Pharri9
Section 004
I worked on the assignment alone, using only this semester's materials' 
and notes'. */

import java.util.Scanner;

public class HW4 {
	public static Scanner input = new Scanner(System.in);

	/* the method roll(int n) generates a radom number between and including 1 and n
	@ param an integer representing the number of sides on the die
	@ return returns an integer that represents the random number that was generated
	*/
	public static int roll(int n) {
		int side = (int) (n * Math.random() + 1);
		return side;
	}

	/* the method holdat20(int compScore) allows the computer to play the game of pigs while 
	holding at a score of twenty or greater and terminating with a roll of one.
	@ param an integer representing the score the computer has going into this roll
	@ return an integer representing the score the computer earned during this turn 
	*/
	public static int holdat20(int compScore) {
		int turnTotal = 0;
		while (turnTotal < 20 && compScore <100) {
			int roll = roll(6);
			System.out.println("Roll:  " + roll);
			if (roll == 1) {
				System.out.println("Turn Total: 0" );
				return 0; 
			}
				else {
					turnTotal = turnTotal + roll;
					compScore = compScore + turnTotal;
				}
		}
		System.out.println("Turn Total: " + turnTotal);
		return turnTotal;
		}

	/* the method holdUI() allows a user to play the game of pigs, the game terminates 
	when the user rolls a one or chooses to stop
	@ param the method holdUI() has no input parameters
	@ return the method holdUI() returns an integer representing the amount of points 
	the user collected during this turn
	*/
	public static int holdUI(){
		int turnTotal = 0;
		int roll = roll(6);
		if (roll == 1) {
			System.out.println("Roll:  " + roll);
			System.out.println("Turn total: 0");
			return 0;
		}
			turnTotal = turnTotal + roll;
			System.out.println("Roll:  " + roll);
			System.out.print("Turn total:  " + turnTotal);
			System.out.print("  (1 to Roll, 2 to Hold): ");
		

		int stopOrGo = input.nextInt();

		while (stopOrGo == 1) {
			roll = roll(6);
			if (roll == 1) {
				System.out.println("Roll:  " + roll);
				System.out.println("Turn total:  0");
				return 0;
			}
			turnTotal = turnTotal + roll;
			System.out.println("Roll:  " + roll);
			System.out.print("Turn total:  " + turnTotal);
			System.out.print("  (1 to Roll, 2 to Hold): ");
			stopOrGo = input.nextInt();


		}
		return turnTotal;
		
	}
	/* the method playGame(String name) is a two player game of pigs between a computer 
	a user, the computer stops their turn when their score is twenty or greater or they 
	roll a one, the user stops their game when they chose to or when the roll a one
	@ param a String representing the name of the user
	@ return the method playGame(String name) does not return a value
	*/
	public static void playGame(String name) {
		boolean compFirst;
		boolean compTurn;
		int compScore = 0;
		int userScore = 0;

		if (roll(2) == 1) {
			compFirst = true;
			compTurn = true;
		} else {
			compFirst = false;
			compTurn = false;
		}

		if (compFirst) {
			System.out.println(name + ", you will be player 2");
		} else {
			System.out.println(name + ", you will be player 1");
		}

		while (compScore <  100 && userScore <  100) {
			if (compFirst) {
				System.out.println("Player 1 Score  " + compScore);
				System.out.println("Player 2 Score  " + userScore);
			} else {
				System.out.println("Player 1 Score  " + userScore);
				System.out.println("Player 2 Score  " + compScore);
			}
			if (compTurn) {
				if (compFirst) {
					System.out.println("It is player 1's turn.");
				} else {
					System.out.println("It is player 2's turn.");
				}
				compScore += holdat20(compScore);
				System.out.println("New score:  " + compScore);
				compTurn = false;

			} else { 
				if (compFirst) {
					System.out.println("It is player 2's turn.");
				} else {
					System.out.println("It is player 1's turn.");
				}
				userScore += holdUI();
				System.out.println("New score:  " + userScore);
				compTurn = true;
			}
		}
		if (compScore >= 100) {
			System.out.println("Game Over!!! Computer wins! The score was " + compScore + " to " + userScore);
		}
			else {
				System.out.println("Game Over!!! " + name + " wins! The score was " + userScore + " to " + compScore);
			}

	}
	public static void main(String[] args) {
		holdat20(0);
		holdUI();
		System.out.println("Enter your name:  ");
		String name = input.next();
		playGame(name);
	}
}