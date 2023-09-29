import stanford.karel.Karel;

public class mine01 extends Karel{
	public void run(){
		for(int p = 0; p < 5; p++){
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 9-2*p; j++){
					putBeeper();
					if( i < 3 || j < 8-2*p){
					move();
					}
				}
			turnLeft();
			}
			move();
		}	
	}
}
