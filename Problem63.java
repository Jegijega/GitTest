import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram{
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	public void run(){
		String name1 = readLine("Enter first name: ");
		String name2 = readLine("Enter second name: ");
		while(!name1.equals("") || !name2.equals("")){
			if(!map.containsKey(name1)){
				map.put(name1, 1);
			}else{
				map.replace(name1, map.get(name1) + 1);
			}
			name1 = readLine("Enter first name: ");
			name2 = readLine("Enter second name: ");
		}
		int most = 0;
		String outgoing = "";
		for(String key : map.keySet()){
			if(map.get(key) > most){
				most = map.get(key);
				outgoing = key;
			}
		}
	}
}
