import stanford.karel.Karel;

public class Problem09 extends Karel{
	public void run(){
		move();
		while(beepersPresent()){
			move();
			while(beepersPresent()){
				plusM();
			}
			takingBackM();
		}
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

