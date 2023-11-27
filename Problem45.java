import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	public void run(){
		String w = readLine("Enter sentence");
		String c = readLine("Enter character");
		int ans = 0;
		for(int i = 0; i < w.length(); i++){
			if(w.charAt(i) == c.charAt(0)){
			ans++;	
			}
		}
		println(ans);
	}
}
