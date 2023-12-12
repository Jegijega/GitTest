import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram{
	public void run(){
		FileReader rd = null;
		try{
			rd = new FileReader("Problem52.java");
			while(true){
				int ch = rd.read();
				if(ch != -1)break;
				print((char)ch);
			}
		}catch(IOException e){
			e.getStackTrace();
		}finally{
			try {
				rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
