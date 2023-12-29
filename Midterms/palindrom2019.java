package Midterms;

import acm.program.ConsoleProgram;

public class palindrom2019 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter Num: ");
		println(isPalindrom(n));
	}

	private boolean isPalindrom(int n) {
		int rev = 0;
		for (int i = n; i > 0; i /= 10){
			rev = rev * 10 + (i % 10);
		}
		if(n == rev){
			return true;
		}
		return false;
	}
}
