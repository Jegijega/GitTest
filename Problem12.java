import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	public void run(){
		
		//add(new GRect(100, 200), 100, 150);
		//add(new GOval(100, 200), 100, 150);
		
		GRect myRect = new GRect(100, 200);
		add(myRect, 100, 150);
		
		//GRect secondRect = new GRect(100, 200);
		//add(secondRect, 300, 150);
		
		GRect myRect1 = new GRect(100, 200);
		add(myRect1, 300, 150);
		
		myRect1.setFilled(true);
		myRect1.setColor(Color.GREEN);
	}

}
