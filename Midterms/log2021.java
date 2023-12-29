package Midterms;

import acm.program.ConsoleProgram;

public class log2021 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter num 1: ");
		int m = readInt("Enter num 2: ");
		println(log(n, m));
	}
	
	private int log(int n, int m){
		int ans = 0;
		for(int i = n; i <= m; i*=n){
			ans++;
			if(m >= i && m < i * n){
				return ans;
			}
		}
		return 0;
	}
}