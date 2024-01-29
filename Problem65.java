import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem65 extends ConsoleProgram{
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	public void run(){
		String name1 = readLine("Enter first name: ");
		String name2 = readLine("Enter second name: ");
		while(!name1.equals("") || !name2.equals("")){
			if(!map.containsKey(name2)){
				map.put(name2, 1);
			}else{
				map.replace(name2, map.get(name2) + 1);
			}
			name1 = readLine("Enter first name: ");
			if(name1.equals("")){
				break;
			}
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
		println(outgoing + "--" + most);
	}
}
