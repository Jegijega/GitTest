
import acm.program.ConsoleProgram;


public class Problem24 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter number: ");
		println(countDivisors(n));
	}

	private int countDivisors(int n) {
		int number = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				number++;
			}
		}
		return number;
	}
}
