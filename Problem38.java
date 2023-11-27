import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem38 extends ConsoleProgram{
	private static final int START_MONEY = 1000;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		
		int money = START_MONEY;
		while (money > 0) {
			println("you have " + money + " $");
			int bet = readInt("enter bet amount: ");
			if (bet > money) {
				println("not enough money, try again.");
				continue;
			}
			int number = readInt("enter number: ");
			money += result(number, bet);
		}
	}
	
	private int result(int chosenNumber, int bet) {
		int winnum = rgen.nextInt(0, 36);
		println(".... " + winnum);
		if (winnum == chosenNumber) {
			println("you won!");
			return 35 * bet;
		}
		println("you lose!");
		return -bet;
	}
}
