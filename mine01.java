import stanford.karel.Karel;

public class mine01 extends Karel{
	public void run(){
		int n = 20;
		for(int p = 0; p < n/2; p++){
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < n-1-2*p; j++){
					putBeeper();
					if( i < 3 || j < n-2-2*p){
					move();
					}
				}
			turnLeft();
			}
			move();
		}	
	}
}
