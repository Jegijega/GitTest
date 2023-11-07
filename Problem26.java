
import acm.program.ConsoleProgram;


public class Problem26 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		println(gcd(n,m));
	}

	private int gcd(int n, int m) {
		int gcd = n * m - 1;
		while(gcd > 1){
			if(n % gcd == 0 && m % gcd == 0){
				return gcd;
			}
			gcd--;
		}
		return 1;
	}
}
