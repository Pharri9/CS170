/*Patrick Harris
Pharri9
Section 004
I worked on the assignment alone, using only this semester's materials' 
and notes'. */

public class HW3 {

/* The method closestBusStop determines which bus stop is nearest to the current street
	@param an integer representing the current street
	@return an integer representing the closest bus stop. */
	public static int closestBusStop(int street) {
		int distance = street % 10;
		if (distance <= 5) {
			return (street - distance);
		}
		else {
			return (street + distance);
		}	
		
		}
/* The method numDimes creates change in cents
	@param an integer representing the number of pennies to be turned into change
	@return an integer representing the number of dimes returned */ 
	public static int numDimes(int penny) {
		int quarter = penny/25;
		int dime = (penny - 25 * quarter)/10;
		int nickel = (penny - ((25 *quarter) + (10 * dime))/5);
		int remainder = penny - ((25 *quarter) + (10 * dime) + (5 * nickel));
		return dime;
	}
/* the method winner determines if a certain lotery number is a winning number 
	@param an integer representing the lottery number on a ticket
	@return a boolean value which states whether the value is a winner or a loser */
	public static boolean winner(int lottery) {
		int y = (lottery % 10);
		int xy = (lottery % 100);
		int x = ((xy)/10);
		int repetitions = 0;

		if (lottery <99999) {
			return false;
		} 
		if (((lottery % 1000) / 100) == y) {
		repetitions = repetitions + 1;
		}
		else {
			repetitions = repetitions;
		}
		if (((lottery % 10000) / 1000) == y) {
		repetitions = repetitions + 1;
		}
		else {
			repetitions = repetitions; 
		}
		if (((lottery % 100000) / 10000) == y) {
		repetitions = repetitions + 1;
		}
		else {
			repetitions = repetitions; 
		}
		if (((lottery % 1000000) / 100000) == y) {
		repetitions = repetitions + 1;
		}
		else {
			repetitions = repetitions; 
		}
		if (repetitions == x) {
			return true;
		}
		else {
			return false;
		}
	}
/* The method triples determines the point value for a game that involves the rolling of three dice
@param three integers representing the roll of each dice
@return an integer representing the amount of points earned */
	public static int triples(int roll1, int roll2, int roll3) {
		if (roll1 == roll2 && roll1 == roll3) {
			return 100;
		}
		else {
			if (roll1 == 1 && roll2 ==1 || roll1 == 1 && roll3 == 1 || roll2 == 1 && roll3 == 1) {
				return 45;
			}
			if (roll1 == 3 && roll2 ==3 || roll1 == 3 && roll3 == 3 || roll2 == 3 && roll3 == 3) {
				return 45;
			}
			if 	(roll1 == 6 && roll2 ==6 || roll1 == 6 && roll3 == 6 || roll2 == 6 && roll3 == 6) {
				return 45;
			}
			else {
				if (roll1%2==0 && roll2%2==0 && roll3%2==0) {
					return 20;
				}
				if (roll1%2==1 && roll2%2==1 && roll3%2==1) {
					return 20;
				}
				else {
					if (roll1 + roll2 == roll3 || roll1 + roll3 == roll2 || roll2 + roll3 == roll1) {
						return 10;
					}
					else {
						return 0;
					}
				}
				
			}
		}
	}
/* The method loaded represents the rolling of an unfair dice
@param loaded does not take any input parameters
@retrun an integer representing the side of the dice that was rolled */
	public static int loaded() {
		double r = Math.random();
		int percent = (int)(100 * r + 1);
		if (percent <= 20) {
			return 1;
		}
		else {
			if (percent > 20 && percent <= 40) {
				return 2;
			}
			else {
				if (percent > 40 && percent <= 60) {
					return 3;
				}
				else {
					if (percent > 60 && percent <=75) {
						return 4;
					}
					else {
						if (percent > 75 && percent <= 90) {
							return 5;
						}
						else {
							if (percent > 90) {
								return 6;
							}
							else {
								return 7;
							}
						}
					}
				}
			}
		}
	}

	public static void main(String [] args) {
		System.out.println(closestBusStop(26));
		System.out.println(numDimes(36));
		System.out.println(winner(999949));
		System.out.println(triples(2,4,6));
		System.out.println(loaded());
	}
}