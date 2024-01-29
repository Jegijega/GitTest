import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem66 extends ConsoleProgram {
	private HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	private ArrayList<String> array = new ArrayList<String>();

	public void run() {
		String name1 = readLine("Enter first name: ");
		String name2 = readLine("Enter second name: ");
		while (!name1.equals("") && !name2.equals("")) {
			if (!map.containsKey(name1)) {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(name2);
				map.put(name1, arr);
				array.add(name1);
			} else {
				map.get(name1).add(name2);
			}
			name1 = readLine("Enter first name: ");
			if (name1.equals("")) {
				break;
			}
			name2 = readLine("Enter second name: ");
		}
		for (String key : map.keySet()) {
			boolean finding = true;
			for (int j = 0; j < array.size(); j++) {
				for (int i = 0; i < map.get(key).size(); i++) {
					if(map.get(key).get(i).equals(array.get(j))){
						finding = false;
					}
				}
				if(finding){
					println(key + ", " + array.get(j));	
				}
			}
		}
	}
}
