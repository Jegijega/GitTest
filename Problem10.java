import stanford.karel.Karel;

public class Problem10 extends Karel{
	public void run(){
		move();
		while(beepersPresent()){
			move();
			while(beepersPresent()){
				pickBeeper();
				moveBack();
				pickBeeper();
				move();
				countBeepersOnTop();
			}
			bringBackBeepers();
			move();
			putBeeper();
			moveBack();
			moveBack();
		}
	}
	private void moveBack(){
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
	}
	
	private void countBeepersOnTop(){
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		putBeeper();
		move();
		turnLeft();
	}
	private void bringBackBeepers(){
		turnLeft();
		move();
		while(beepersPresent()){
			turnLeft();
			turnLeft();
			pickBeeper();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
		}
		turnLeft();
		turnLeft();
		move();
		turnLeft();
	}
}	
