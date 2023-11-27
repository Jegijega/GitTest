import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	public void run() {
		for(int j = 1; j <=1000000; j++){	
			int div = 0;
			for(int i = 1; i <= j; i++ ){
				if( j % i == 0){
					div++;
				}
			}
			if(div == 2){
				println(j);
			}
		}	
	}
}	