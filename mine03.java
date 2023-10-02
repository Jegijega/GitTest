import stanford.karel.SuperKarel;

public class mine03 extends SuperKarel {
	public void run(){	
		int h=1, w=1;
		
		while(h < 10 || w < 10){
			for(int i = 0; i < 3; i++){
				if(rightIsClear()){
					turnRight();
					move();
					if(facingNorth()){
						h++;
					}
					if(facingSouth()){
						h--;
					}
					if(facingEast()){
						w++;
					}
					if(facingWest()){
						w--;
					}
					break;
				}
				if(frontIsClear()){
					move();
					if(facingNorth()){
						h++;
					}
					if(facingSouth()){
						h--;
					}
					if(facingEast()){
						w++;
					}
					if(facingWest()){
						w--;
					}
					break;
				}
				if(leftIsClear()){
					turnLeft();
					move();
					if(facingNorth()){
						h++;
					}
					if(facingSouth()){
						h--;
					}
					if(facingEast()){
						w++;
					}
					if(facingWest()){
						w--;
					}
					break;
				} else{
					turnLeft();
					turnLeft();
					move();
					if(facingNorth()){
						h++;
					}
					if(facingSouth()){
						h--;
					}
					if(facingEast()){
						w++;
					}
					if(facingWest()){
						w--;
					}
					}
			}
		}	
	}
}