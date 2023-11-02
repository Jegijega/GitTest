
import java.awt.*;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem22 extends GraphicsProgram{ 	
	public void run(){
		double squareX = getWidth() / 8;
		double squareY = getHeight() / 8;
		for(int j = 0; j < 8; j += 2){	
			for(int i = 0; i < 4; i++){
				drawSquareB(squareX,squareY, i, j);
				//drawSquareW();
			}
		}	
	}

	private void drawSquareB(double squareX, double squareY, int X, int Y){
		GRect rect1 = new GRect(squareX,squareY);
		add(rect1, squareX * 2 * X, squareY * Y);
		rect1.setFilled(true);
		rect1.setColor(Color.BLACK);
		GRect rect2 = new GRect(squareX,squareY);
		add(rect2, squareX + squareX * 2 * X, squareY * Y + squareY);
		rect2.setFilled(true);
		rect2.setColor(Color.BLACK);
	}
}
