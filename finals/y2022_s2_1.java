package finals;

import acm.program.ConsoleProgram;

public class y2022_s2_1 extends ConsoleProgram{
	public void run(){
		String S = readLine("Enter String: ");
		String T = readLine("Enter String: ");
		int counter = 0;
		for(int i = 0; i < S.length() / 2; i++){
			if(!checkIfDone(S.charAt(i),S.charAt(S.length() - 1 - i),T.charAt(i),T.charAt(T.length() - 1 - i))){
				break;
			}else{
				counter++;
			}
		}
		if(counter == S.length() / 2 && (("" + S.charAt(S.length() / 2)).equals(("" + T.charAt(T.length() / 2 ))) || S.length() % 2 == 0)){
			println(true);
		}else println(false);
	}

	private boolean checkIfDone(char s1, char s2, char t1, char t2) {
		if(("" + s1).equals("" + s2) && ("" + t1).equals("" + t2)){
			return true;
		}
		if(("" + s1).equals("" + t1) && ("" + s2).equals("" + t2)){
			return true;
		}
		if(("" + s1).equals("" + t2) && ("" + s2).equals("" + t1)){
			return true;
		}
		return false;
	}
}
