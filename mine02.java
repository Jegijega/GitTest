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
			if(j < 4){
			turnLeft();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			turnLeft();
			}
		}
		for(int i = 0; i < 4; i++){
			move();
		}
		turnLeft();
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
			if(j < 4){
			turnLeft();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			turnLeft();
			}
		}
	}
}