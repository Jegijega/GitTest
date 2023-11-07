
import acm.program.ConsoleProgram;


public class Problem27 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter first number: ");
		int m = readInt("Enter second number: ");
		println(ans(n,m));
	}

	private int ans(int n, int m) {
		int ans = 1;
		for(int i = 0; i < m; i++){
			ans *= n;
		}
		return ans;
	}
}
