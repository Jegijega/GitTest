import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	private int[][] matr;
	public void run() {
		int n = readInt("Enter text");
		matr = new int[n][n];
		int count= 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matr[i][j] = readInt("Enter value of(" + i + "," + j + ")");
				int unique = 0;
				for(int k = 0; k < n; k++){
					for(int m = 0; m < n; m++){
						if(matr[i][j] == matr[k][m]){
							unique++;
						}
					}
				}
				if(unique == 1){
					count++;
				}
			}
		}
		if(count == n*n){
			println("magicMatrix");
		}else{
			println("not magivMatrix");
		}
	}
}
