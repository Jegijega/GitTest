package Midterms;

import acm.program.ConsoleProgram;

public class exam2 extends ConsoleProgram{
	public void run(){
		String first = readLine("enter: ");
		String second = readLine("enter: ");
		for(int i = 0; i < first.length(); i++){
			for(int j = 0; j < second.length(); j++){
				int k = 0;
				if(i + j > first.length()){
					k = i + j - first.length();
				}else{
					k = i;
				}
				first.charAt(k);
			}
		}
	}

}
