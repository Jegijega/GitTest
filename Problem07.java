import stanford.karel.Karel;

public class Problem07 extends Karel{
	public void run(){
		while(frontIsClear()){
			while(frontIsClear()){
				if(noBeepersPresent()){
					putBeeper();
				}
			}
			if(facingEast()){
				turnLeft();
				move();
				turnLeft();
			} else{
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