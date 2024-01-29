import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public void run(){
		int num = 0;
		while(num != -1){
			num = readInt("Enter number: ");
			list.add(num);
		}
		print(-1);
		for(int i = list.size() - 1; i >= 0; i--){
			print(" " + list.get(i));
		}
	}
}
