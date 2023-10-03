import stanford.karel.Karel;

public class Problem08 extends Karel{
	public void run(){
	move();
	while(beepersPresent()){
		plusN();
	}
	move();
	while(beepersPresent()){
		minusM();
	}
	
	}
	
	private void plusN(){
		pickBeeper();
		move();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
	}
	private void minusM(){
		pickBeeper();
		move();
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
	}
}
