import stanford.karel.Karel;

public class Problem06 extends Karel{
	public void run(){
	move();
	while(beepersPresent()){
		plusN();
	}
	move();
	while(beepersPresent()){
		plusM();
	}
	takingBackN();
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
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
	
	}
	
	private void plusM(){
		pickBeeper();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
	}
	
	private void takingBackN(){
		turnLeft();
		move();
		turnLeft();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
		}
	}
}
