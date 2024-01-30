package finals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class y2020_s3_1 extends ConsoleProgram{
	public void run(){
		unstable("ulala");
	}
	private Iterator<String> unstable(String s){
		ArrayList<String> arr = new ArrayList<>();
		try{
			BufferedReader br = new BufferedReader(new FileReader(s));
			String line = br.readLine();
			boolean in1 = false;
			boolean de2 = false;
			boolean in3 = false;
			boolean finished = false;
			while(line != null){
				for(int i = 1; i < line.length(); i++){
					if(line.charAt(i) > line.charAt(i - 1)){
						in1 = true;
					}else{
						for(int j = i; j < line.length(); j++){
							if((int)line.charAt(i) < (int)line.charAt(i - 1)){
								de2 = true;
							}else{
								for(int k = j; k < line.length(); k++){
									if((int)line.charAt(i) > (int)line.charAt(i - 1)){
										in3 = true;
									}else{
										finished = true;
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				if(in1 && de2 && in3 && !finished){
					arr.add(line);
				}
				line = br.readLine();
			}
		}catch(IOException e){
			println("nwnw");
		}
		
		return arr.iterator();
	}
}
