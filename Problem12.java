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
		drawWindows();
		//drawRoof();
		//drawDoor();
		}
	
	private void drawWindows(){
		for(int i = 0; i < 2; i++){
			double x; 
			int y = (int) (getHeight() - HOUSE_HEIGHT + WINDOW_HEIGHT / 3);
			if(i == 0){
				x = getWidth() / 2 - HOUSE_WIDTH / 2 + WINDOW_WIDTH / 2;
			}else {
				x = getWidth() / 2 - HOUSE_WIDTH / 2 + WINDOW_WIDTH / 2;
			}
		}
	}
	
	
	
	private void drawWall(){
		GRect wall = new GRect(HOUSE_WIDTH,HOUSE_HEIGHT);
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}

}