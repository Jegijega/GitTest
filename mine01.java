import stanford.karel.Karel;

public class mine01 extends Karel{
	public void run(){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 9; j++){
				putBeeper();
				move();
			}
		turnLeft();
		}
	}
}
