package worlds;

import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter Amount: ");
		int [] arr = new int[n];
		fillArray(arr);
		println(isSorted(arr));
	}
	
	private boolean isSorted(int[] arr) {
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < arr[i - 1]){
				return false;
			}
		}
		return true;
	}

	private void fillArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			arr[i] = readInt("Enter Number: ");
		}
	}
}