package finals; 

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class y2022_s2_3 extends ConsoleProgram{
	public void run(){
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(0);
		array1.add(9);
		array1.add(7);
		array1.add(3);
		array2.add(1);
		array2.add(2);
		array2.add(2);
		array2.add(9);
		ArrayList<Integer> finalArray = multiply(array1, array2);
		for(Integer next: finalArray){
			print(next + " ");
		}
	}

	private ArrayList<Integer> multiply(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int ans = 0;
		for(int i = array1.size() - 1; i >= 0; i--){
			int mult1 = 0;
			for(int j = array2.size() - 1; j >= 0; j--){
				mult1 += array1.get(i) * array2.get(j) * Math.pow(10, array2.size() - 1 - j);
			}
			ans += mult1 * Math.pow(10, array1.size() - 1 - i);
		}
		while(ans != 0){
			array.add(0, ans % 10);
			ans /= 10;
		}
		return array;
	}

}
