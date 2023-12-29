import java.util.Arrays;
import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter Amount: ");
		int [] arr = new int[n];
		fillArray(arr);
		findTwoMax(arr);
		findTwoMaxBySort(arr);
	}

	private void findTwoMaxBySort(int[] arr) {
		Arrays.sort(arr);
		println(arr[arr.length - 1]);
		println(arr[arr.length - 2]);
	}

	private void findTwoMax(int[] arr) {
		int max1, max2;
		if(arr[0] > arr[1]){
			max1 = arr[0];
			max2 = arr[1];
		}else{
			max1 = arr[1];
			max2 = arr[0];
		}
		
		 
		for(int i = 2; i < arr.length; i++){
			if(arr[i] > max1){
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2){
				max2 = arr[i];
			}
		}
		println(max1);
		println(max2);
	}

	private void fillArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			arr[i] = readInt("Enter Number: ");
		}
	}
}