import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram{
	public void run(){
		int n = readInt("n = ");
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		println("Sum = " + sum);
	}
}
