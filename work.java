import java.util.Random;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class work extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		println(rgen);
	}
}
