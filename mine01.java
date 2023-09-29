import stanford.karel.Karel;

public class mine01 extends Karel{
	public void run(){
		//for(int p = 0; p < )
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 9; j++){
					putBeeper();
					if( i < 3 || j < 8){
					move();
					}
				}
			turnLeft();
			}
	}
}
