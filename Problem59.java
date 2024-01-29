import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram{
	private int[][] matr;
	public void run() {
		int n = readInt("Enter rows ");
		int m = readInt("Enter columns ");
		matr = new int[n][m];
		int ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matr[i][j] = readInt("Enter value of(" + i + "," + j + ")");
			}
		}
		for(int j = 0; j < m; j++){
			for(int i = 0; i < n; i++){
				if(matr[i][j] == 1){
					int oneInRow = 0; 
					for(int k = j; k < m; k++){
						if(matr[i][k] == 1){
							oneInRow++;
						}else{
							break;
						}
					}
					if(oneInRow > ans){
						ans = oneInRow;
					}
					for(int l = i + 1; l < n; l++){
						int nextOneInRow = 0;;
						for(int k = j; k < m; k++){
							if(matr[l][k] == 1){
								nextOneInRow++;
							}else{
								break;
							}
						}
						if(nextOneInRow >= oneInRow){
							if(oneInRow * (l - i + 1) > ans){
								ans = oneInRow * (l - i + 1);
							}
						}else{
							break;
						}
					}
				}
			}	
		}	
		println(ans);
	}	
}

//0000000
//0001110
//1101100
//1000110
//1111111
//0101010