import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem35 extends ConsoleProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		double n = readInt("Enter amount ");
		double sum = 0;
		for(int i = 0; i < n; i++){
			boolean lep = false;
			while(lep == false){
				lep = rgen.nextBoolean();
				sum++;
			}
		}
		println(sum / n);
	}
}
