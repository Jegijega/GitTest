import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram {
	public void run(){
		String word = readLine("Enter sentence: ");
		int max = 0;
		char maxchar = ' ';
		for(int j = 0; j < word.length(); j++){
			int counter = 0;
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) == word.charAt(j)){
					counter++;
				}
				if(counter > max){
					max = counter;
					maxchar = word.charAt(j);
				}
			}
		}	
		println(maxchar);
		println(max);
	}
}