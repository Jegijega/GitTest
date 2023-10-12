import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	private static final double WINDOW_WIDTH = 200;
	private static final double WINDOW_HEIGHT = 200;
	
	public void run(){
		drawWall();
	}
	
	private void drawHouse(){
	drawWall();
	//drawWindows();
	//drawRoof();
	//drawDoor();
	}
	
	private void drawWall(){
		GRect wall = new GRect(HOUSE_WIDTH,HOUSE_HEIGHT);
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}

}