
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;


public class work extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double x = rgen.nextDouble(7.5, 8.5);
		println(x);
	}
}
