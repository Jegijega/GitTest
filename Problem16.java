import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram{
	public void run() {
		int a = readInt("enter first number");
		int b = readInt("enter second number");
		int c = readInt("enter third number");
		
		int harm = 1 / (1 / a + 1 / b + 1 / c);
		
		println(harm);
	}
}
