import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram{
	public void run(){
		String a = readLine("Enter String: ");
		for(int i = 0; i < a.length(); i++){
			for(int j = i + 1; j < a.length(); j++){
				if(a.charAt(i) == a.charAt(j)){
					if(j == 0){
						a = a.substring(1);
					}else{
						a = a.substring(0, j) + a.substring(j + 1);
					}
				}
			}
		}
		println(a);
	}
}
