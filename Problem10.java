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
			}
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
}	
