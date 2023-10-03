import stanford.karel.SuperKarel;

public class Problem11 extends SuperKarel {
	public void run(){
		
		while(noBeepersPresent()){
			for(int i = 0; i < 3; i++){
				if(rightIsClear()){
					turnRight();
					move();
					break;
					}
				if(frontIsClear()){
					move();
					break;
				}
				if(leftIsClear()){
					turnLeft();
					move();
					break;
				} else{
					turnLeft();
					turnLeft();
					move();
					}
			}
		}	
			
		if(facingNorth()){
		turnRight();
		}
	}
	
}