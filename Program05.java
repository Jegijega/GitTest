import stanford.karel.Karel;

public class Program05 extends Karel {
	public void run(){
		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}else{
				putBeeper();
				move();
			}
		}
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}
