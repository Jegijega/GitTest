import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram{
	public void run(){
		String a = readLine("Enter String");
		StringTokenizer token = new StringTokenizer(a);
		int count = 0;
		while(token.hasMoreTokens()){
			token.nextToken();
			count++;
		}
		println(count);
	}
}
