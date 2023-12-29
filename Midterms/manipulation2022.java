package Midterms;

import acm.program.ConsoleProgram;

public class manipulation2022 extends ConsoleProgram{
	public void run(){
		String a = readLine("Enter String: ");
		String b = readLine("Enter String: ");
		println(manipulation(a, b));
	}	
	
	public boolean manipulation(String a, String b){
		String firstHalf;
		String secondHalf;
		for(int i = 1; i < a.length() - 1; i++){
			firstHalf = a.substring(0 , i);
			secondHalf = a.substring(i);
			for(int j = 0; j < firstHalf.length(); j++){ 
				for(int n = 0; n < firstHalf.length(); n++){
					String firstHalfNew = null;
					if(firstHalf.charAt(n) == firstHalf.charAt(j)){
						firstHalfNew = firstHalf.substring(0, n) + firstHalf.substring(n+1);
					}
					for(int z = 0; z < secondHalf.length(); z++){ 
						for(int k = 0; k < secondHalf.length(); k++){
							String secondHalfNew = null;
							if(secondHalf.charAt(z) == secondHalf.charAt(k)){
								secondHalfNew = secondHalf.substring(0, z) + secondHalf.substring(z + 1);
							}
							String ans = secondHalfNew + firstHalfNew;
							if(ans.equals(b)){
								return true;
							}	
						}
					}		
				}	
			}
		}
		return false;
	}	
}
