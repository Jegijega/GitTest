import stanford.karel.Karel;

public class mine02 extends Karel{
	public void run(){
		for(int i = 0; i < 4; i++){
			move();
		}
		for(int j = 0; j < 5; j++){
			putBeeper();
			move();
			putBeeper();
			turnLeft();
			move();
			putBeeper();
			turnLeft();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
		}
	}
}