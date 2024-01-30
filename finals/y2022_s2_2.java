package finals;

import java.lang.reflect.Array;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class y2022_s2_2 extends ConsoleProgram{
	private int[] arr;
	public void run(){
		int n = readInt("length: ");
		arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = readInt("Enter " + i + ": ");
		}
		int[][] array = create();
		for(int i = 0; i < n; i++){
			println(Arrays.toString(array[i]));
		}
	}
	private int[][] create() {
		int[][] array = new int[arr.length][];
		for(int i = 0; i < arr.length; i++){
			int len = arr[i];
			array[i] = new int[len];
		}
		return array;
	}
}
