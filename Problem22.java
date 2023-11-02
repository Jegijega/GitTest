
import java.awt.*;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem22 extends GraphicsProgram{ 	
	public void run(){
		double squareX = getWidth() / 8;
		double squareY = getHeight() / 8;
		for(int j = 0; j < 8; j++){	
			for(int i = 0; i < 4; i++){
				drawSquareB(squareX,squareY, i, j);
				//drawSquareW();
			}
		}	
	}

	private void drawSquareB(double squareX, double squareY, int X, int Y){
		GRect rect = new GRect(squareX,squareY);
		add(rect, squareX * 2 * X, squareY * Y);
		rect.setFilled(true);
		rect.setColor(Color.BLACK);
		
	}
}
