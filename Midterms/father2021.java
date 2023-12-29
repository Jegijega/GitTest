package Midterms;

import acm.program.ConsoleProgram;

public class father2021 extends ConsoleProgram{
	public void run(){
		String fatherDNA = readLine("Enter father dna: ");
		String sonDNA = readLine("Enter son dna: ");
		println(amIYouFatherLuke(fatherDNA, sonDNA));
	}

	private boolean amIYouFatherLuke(String fatherDNA, String sonDNA) {
		int max = 0;
		int counter = 0;
		for(int i = 0; i < fatherDNA.length(); i++){
			for(int j = 0; j < sonDNA.length(); j++){
				counter = 0;
				if(fatherDNA.charAt(i) == sonDNA.charAt(j)){
					counter++;
					for(int n = 1; n <= (Math.min(fatherDNA.length() - i - 2, sonDNA.length() - j - 2)); n++){
						if(fatherDNA.charAt(i + n) == sonDNA.charAt(j + n)){
							counter++;
						}else break;
					}
				}
				if(counter > max){
					max = counter;
				}
			}
		}
		if(max > sonDNA.length() / 2 ){
			return true;
		}
		return false;
	}
}
