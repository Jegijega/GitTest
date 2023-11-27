import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		int n = readInt("Enter number ");
		int randnum = rgen.nextInt(1, 36);
		println(randnum);
		if(n == randnum){
			println("won");
		}else{
			println("lost");
		}
	}
}
