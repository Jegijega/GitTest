import stanford.karel.Karel;

public class Problem07 extends Karel{
	public void run(){
		while(frontIsClear()){
			while(frontIsClear()){
				checkBeepersAndPut();
				move();
			}
			if(facingEast()){
				turnAroundFromEast();
			} else{
				turnAroundFromWest();
			}
		}
	}
	
	private void checkBeepersAndPut(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}
	
	private void turnAroundFromEast(){
		checkBeepersAndPut();
		turnLeft();
		if(frontIsClear()){
			move();
			turnLeft();
		}
	}
	
	private void turnAroundFromWest(){
		checkBeepersAndPut();
		turnLeft();
		turnLeft();
		turnLeft();
		if(frontIsClear()){
			move();
			turnLeft();
			turnLeft();
			turnLeft();
		}
	}
	
}