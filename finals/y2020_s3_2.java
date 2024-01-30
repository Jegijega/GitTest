package finals;

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class y2020_s3_2 extends ConsoleProgram{
	private int[][] matr;
	private int num = 1;
	public void run(){
		int m = readInt("Enter M: ");
		int n = readInt("Enter N: ");
		int min = Math.min(m, n);
		if(min % 2 == 1){
			min++;
		}
		matr = new int[m][n];
		int l = 0;
		for(int i = 0; i < min / 2; i++){
			oneline(m, n, l);
			l++;
		}
		for(int i = 0; i < m; i++){
			println(Arrays.toString(matr[i]));
		}
	}

	private void oneline(int m, int n, int l) {
		for(int i = 0 + l; i < n - 1 - l; i++){
			matr[0 + l][i] = num;
			num++;
		}
		for(int i = 0 + l; i < m - 1 - l; i++){
			matr[i][n - 1 - l] = num;
			num++;
		}
		for(int i = n - 1 - l; i > 0 + l; i--){
			matr[m-1 - l][i] = num;
			num++;
		}
		for(int i = m - 1 - l; i > 0 + l; i--){
			matr[i][0 + l] = num;
			num++;
		}
	}
}