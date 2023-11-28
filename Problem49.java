
import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram{
	public void run(){
		String num = readLine("Enter Number: ");
		print(stringToInteger(num));
	}

	private int stringToInteger(String num) {
		int result = 0;
		for(int i = 0; i < num.length(); i++){
			int n = num.charAt(i) - '0';
			result = result * 10 + n;
		}
		return result;
	}
}