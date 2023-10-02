import stanford.karel.SuperKarel;

public class mine03 extends SuperKarel {
	public void run(){	
		int h=0, w=0;
		
		while(h < 10 || w < 10){
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
	}
}