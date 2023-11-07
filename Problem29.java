
import acm.program.ConsoleProgram;


public class Problem29 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter a number ");
		println(counting(n));
		}

	private int counting (int n) {
		int count1 = 1;
		int count2 = 1;
		int count = 0;
		if(n >= 3){
			for(int i = 3; i <= n; i++){
				count = count1 + count2;
				count1 = count2;
				count2 = count;
			}
			return count;
		}else{
			return 1;
		}
	}
}
