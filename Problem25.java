
import acm.program.ConsoleProgram;


public class Problem25 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		println(lcm(n,m));
	}

	private int lcm(int n, int m) {
		int lcm = 1;
		while(lcm < n * m){
			if(lcm % n == 0 && lcm % m == 0){
				return lcm;
			}
			lcm++;
		}
		return n * m;
	}
}
