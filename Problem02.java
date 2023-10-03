import stanford.karel.Karel;

public class Problem02 extends Karel{
	public void run(){
		
		moveToTheBeeperPile();
		
		pickAllBeepers();
		move();
		putAllBeepers();
		
		
	}
	
	private void moveToTheBeeperPile(){
		for(int i = 0; i < 4; i++){
			move();
		}
	}
	
	private void pickAllBeepers(){
		for(int i = 0; i < 10; i++){
			pickBeeper();
		}
	}
	
	private void putAllBeepers(){
		for(int i = 0; i < 10; i++){
			putBeeper();
		}
	}

}
