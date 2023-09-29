import stanford.karel.Karel;

public class mine01 extends Karel{
	public void run(){
		for(int i = 0; i < 10; i++){
			putBeeper();
			move();
			
		}
	}
}
