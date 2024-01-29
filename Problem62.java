import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem62 extends ConsoleProgram{
	private HashMap<String,Integer> map = new HashMap<String, Integer>();
	public void run(){
		String name = readLine("Enter name: ");
		while(!name.equals("")){
			print(1);
			if(!map.containsKey(name)){
				map.put(name, 1);
			}else{
				map.replace(name, map.get(name) + 1);
			}
		}
		for(String key : map.keySet()){
			println(key + ": " + map.get(key));
		}
		
	}
}
