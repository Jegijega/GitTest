import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	private static final double WINDOW_WIDTH = 200;
	private static final double WINDOW_HEIGHT = 200;
	
	public void run(){
		drawHouse();
	}
	
	private void drawHouse(){
		drawWall();
		drawRoof();
		}
	
	private void drawRoof(){
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - HOUSE_HEIGHT;
		GLine roof1 = new GLine(getWidth() / 2 - HOUSE_WIDTH / 2, getHeight() - HOUSE_HEIGHT , getWidth() / 2, getHeight() - HOUSE_HEIGHT - 100);
		add(roof1);
		GLine roof2 = new GLine(getWidth() / 2 + HOUSE_WIDTH / 2, getHeight() - HOUSE_HEIGHT, getWidth() / 2, getHeight() - HOUSE_HEIGHT - 100);
		add(roof2);
	}
	
	
	
	private void drawWall(){
		GRect wall = new GRect(HOUSE_WIDTH,HOUSE_HEIGHT);
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}

}