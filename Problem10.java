import stanford.karel.Karel;

public class Problem10 extends Karel{
	public void run(){
	int n=0, m=0;
	move();
	while(beepersPresent()){
		n++;
		pickBeeper();
	}
	for(int j = 0; j < n; j++){

		putBeeper();
	}
	move();
	while(beepersPresent()){
		m++;
		pickBeeper();
	}
	for(int j = 0; j < m; j++){
		putBeeper();
	}
	move();
		for(int i = 0; i < n/m; i++)
	putBeeper();

		move();
	}
}
