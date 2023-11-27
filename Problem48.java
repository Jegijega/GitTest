import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram{
	public void run(){
		String word = readLine("Enter sentence: ");
		for(int i = 0; i < 26; i++){
			char ch = (char)('a' + i);
			int ans = 0;
			for(int j = 0; j < word.length(); j++){
				if(word.charAt(i) == ch){
				ans++;
				}
			}
			println(ch + " " + ans);	
		}
	}

}
