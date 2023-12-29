import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram {
	
	public void run(){
		BufferedReader rd = openFileReader("File Name: ");
		String file = "";
		while(true){
			try {
				String line = rd.readLine();
				if(line == null){
					rd.close();
					break;
				}
				file += line;
			} catch (IOException e) {
//				e.printStackTrace();
				println();
			}
		}
		int words = printStatistics(file, " ");
		int sentences = printStatistics(file, ".!?;");
		int sentencesWithPoint = printStatistics(file, ".");
		
		println(words);
		println(sentences);
		println(sentencesWithPoint);
	}
	
	
	private int printStatistics(String file, String delimiter) {
		StringTokenizer token = new StringTokenizer(file, delimiter);
		int amount = getAmountOfTokens(token);
		return amount;
	}


	private int getAmountOfTokens(StringTokenizer token) {
		return token.countTokens();
	}



	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			String name = readLine(prompt);
			try {
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("Can't open that file.");
			}
		}
		return rd;
	}
}