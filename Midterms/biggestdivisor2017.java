package Midterms;

import acm.program.ConsoleProgram;

public class biggestdivisor2017 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter number: ");
		int ans = 0;
		for(int i = n; i > 1; i--){
			if( n % i == 0){
				int counter = 0;
				for(int j = i; j > 1; j--){
					if(i % j == 0){
						counter++;
					}	
				}
				if(counter == 1){
					ans = i;
					break;
				}
			}	
		}	
		println(ans);
	}	
}