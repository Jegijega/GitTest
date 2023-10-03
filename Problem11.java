import stanford.karel.SuperKarel;

public class Problem11 extends SuperKarel {
	public void run(){	
		int n=1, e=1;
		
		while(n < 10 || e < 10){
			for(int i = 0; i < 3; i++){
				if(rightIsClear()){
					turnRight();
					move();
					if(facingNorth()){
						n++;
					}
					if(facingSouth()){
						n--;
					}
					if(facingEast()){
						e++;
					}
					if(facingWest()){
						e--;
					}
					break;
				}
				if(frontIsClear()){
					move();
					if(facingNorth()){
						n++;
					}
					if(facingSouth()){
						n--;
					}
					if(facingEast()){
						e++;
					}
					if(facingWest()){
						e--;
					}
					break;
				}
				if(leftIsClear()){
					turnLeft();
					move();
					if(facingNorth()){
						n++;
					}
					if(facingSouth()){
						n--;
					}
					if(facingEast()){
						e++;
					}
					if(facingWest()){
						e--;
					}
					break;
				} else{
					turnLeft();
					turnLeft();
					move();
					if(facingNorth()){
						n++;
					}
					if(facingSouth()){
						n--;
					}
					if(facingEast()){
						e++;
					}
					if(facingWest()){
						e--;
					}
					}
			}
		}	
		turnRight();
	}
}