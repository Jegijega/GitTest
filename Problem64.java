import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem64 extends ConsoleProgram{
	private HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	public void run(){
		String name1 = readLine("Enter first name: ");
		String name2 = readLine("Enter second name: ");
		while(!name1.equals("") || !name2.equals("")){
			if(!map.containsKey(name1)){
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(name2);
				map.put(name1, arr);
			}else{
				map.get(name1).add(name2);
			}
			name1 = readLine("Enter first name: ");
			if(name1.equals("")){
				break;
			}
			name2 = readLine("Enter second name: ");
		}
		for(String key : map.keySet()){
			println(key + ": " + map.get(key).toString());
		}
	}
}
