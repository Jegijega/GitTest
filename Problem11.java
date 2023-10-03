import stanford.karel.SuperKarel;

public class Problem11 extends SuperKarel {
	public void run(){	
		int n=1, e=1;
		
		while(n < 10 || e < 10){
			for(int i = 0; i < 3; i++){
				if(rightIsClear()){
					turnRight();
					move();
					if(beepersPresent()){
						break;
					}
				}
				if(frontIsClear()){
					move();
					if(beepersPresent()){
						break;
					}
				}
				if(leftIsClear()){
					turnLeft();
					move();
					if(beepersPresent()){
						break;
					}
				} else{
					turnLeft();
					turnLeft();
					move();
					if(beepersPresent()){
						break;
					}
					}
			}
		}	
		if(facingNorth()){
		turnRight();
		}
	}
	
}