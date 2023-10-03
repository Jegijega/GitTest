import stanford.karel.Karel;

public class Problem08 extends Karel{
	public void run(){
		int n=7, m=5;
		
		for(int i = 0; i < 3; i++){
			move();
		}
		for(int i = 0; i < n-m; i++)
		putBeeper();
	}
}
