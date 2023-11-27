import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram{
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run(){
		int n = readInt("Enter amount ");
		int sum = 0;
		for(int i = 0; i < n; i++){
			int tries = 0;
			while(tries < 3){
				boolean lep = rgen.nextBoolean();
				if(lep){
					tries++;
				}else{
					tries = 0;
				}
				sum++;
			}
		}
		println((double)sum / n);
	}
}
