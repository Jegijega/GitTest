import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram{
	private static final double FACE_WIDTH = 200;
	private static final double FACE_HEIGHT = 200;
	private static final double EYE_WIDTH = 200;
	private static final double EYE_HEIGHT = 200;
	public void run(){
		drawHead();
		drawEyes();
	}
	
	private void drawHead(){
		GRect head = new GRect(FACE_WIDTH,FACE_HEIGHT);
		add(head, getWidth() / 2 - FACE_WIDTH / 2, getHeight() / 2 - FACE_HEIGHT / 2);
	}
	
	private void drawEyes(){
		
	}
}