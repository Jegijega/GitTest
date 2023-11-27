import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram{
	public void run(){
		String word = readLine("Enter word: ");
		boolean ans = true;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
				ans = false;
				break;
			}
		}
		println(ans);
	}
}
