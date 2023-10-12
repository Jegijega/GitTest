import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	private static final double WINDOW_WIDTH = 200;
	private static final double WINDOW_HEIGHT = 200;
	
	public void run(){
		drawMidLine();
	}
	
	private void drawHouse(){
	drawWall();
	drawWindows();
	drawRoof();
	drawDoor();
	}
	
	private void drawWall(){
		GRect wall = new Grect(HOUSE_WIDTH,HOUSE_HEIGHT);
		double x;
		double y = getHeight() - HOUSE_HEIGHT;
	}

