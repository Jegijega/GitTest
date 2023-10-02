import stanford.karel.Karel;

public class Problem07 extends Karel{
	public void run(){
		while(frontIsClear()){
			while(frontIsClear()){
				if(noBeepersPresent()){
					putBeeper();
				}
				move();
			}
			if(facingEast()){
				if(noBeepersPresent()){
					putBeeper();
				}
				turnLeft();
				if(frontIsClear()){
				move();
				turnLeft();
				}
			} else{
				if(noBeepersPresent()){
					putBeeper();
				}
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
	}
}