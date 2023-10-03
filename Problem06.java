import stanford.karel.Karel;

public class Problem06 extends Karel{
	public void run(){
	int n=0, m=0;
	move();
	while(beepersPresent()){
		n++;
		pickBeeper();
	}
	while(beepersInBag()){
		putBeeper();
	}
	move();
	while(beepersPresent()){
		m++;
		pickBeeper();
	}
	while(beepersInBag()){
		putBeeper();
	}
	move();
		for(int i = 0; i < n+m; i++)
	putBeeper();

		
	}
}
