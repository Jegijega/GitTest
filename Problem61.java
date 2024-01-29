import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram{
	private int[] arr;
	public void run(){
		int m = readInt("Enter m = ");
		int n = readInt("Enter n = ");
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("num " + i + ": ");
		}
		int ans1 = 0;
		int ans2 = 0;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[i] + arr[j] == m){
					ans1 = arr[i];
					ans2 = arr[j];
				}
			}
		}
		println(ans1 + ", " + ans2);
	}

}
