
import acm.program.ConsoleProgram;


public class Problem28 extends ConsoleProgram{
	public void run(){
		int n = 0;
		countEvens(n);
	}

	private int countEvens (int n) {
		int count = 0;
		while(n != -1){
			n = readInt("? ");
			if(n % 2 == 0){
				count++;
			}
		}
		return count;
	}
}
