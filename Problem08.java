import stanford.karel.Karel;

public class Problem08 extends Karel{
	public void run(){
	move();
	while(beepersPresent()){
		plusN();
	}
	takingBackN();
	move();
	while(beepersPresent()){
		minusM();
	}
	takingBackM();
	}
	
	private void plusN(){
		pickBeeper();
		move();
		move();
		putBeeper();
		turnLeft();
		move();
		turnLeft();
		move();
		move();
		putBeeper();
		turnLeft();
		move();
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
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			turnLeft();
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
	
	private void takingBackM(){
		turnLeft();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			turnLeft();
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