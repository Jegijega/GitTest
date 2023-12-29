package Midterms;

import acm.program.ConsoleProgram;

public class spellword2017 extends ConsoleProgram{
	public void run(){
		String a = readLine("Enter string: ");
		String b = readLine("Enter string: ");
		println(check(a, b));
	}	
	
	private boolean check(String a, String b){
		int count = 0;
		for(int i = 0; i < b.length(); i++){
			for(int j = 0; j < a.length(); j++){
				if( a.charAt(j) == b.charAt(i)){
					count++;
					a =	a.substring(0 , j) + a.substring(j + 1);
					break;
				}	
			}
		}
		if( count == b.length() ){
			return true;
		}	
		return false;
	}
}
