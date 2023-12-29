import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter Amount: ");
		ArrayList<Integer> arr = new ArrayList<Integer>();

		fillArray(arr, n);
		println(arr.toString());
		sortArrayList(arr);
		println(arr.toString());
	}
	private void sortArrayList(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size() - 1; i++){
			for(int j = 0; j < arr.size() - i - 1; j++){
				if(arr.get(j) > arr.get(j + 1)){
					swap(arr, j, j + 1);
				}
			}
		}
	}
	private void swap(ArrayList<Integer> arr, int j, int i) {
		int tmp = arr.get(j);
		arr.set(j, arr.get(i));
		arr.set(i, tmp);
	}
	private void fillArray(ArrayList<Integer> arr, int n) {
		for(int i = 0; i < n; i++){
			arr.add(readInt("Enter Number: "));
		}
	}
}