import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram{
	private static final double FACE_WIDTH = 200;
	private static final double FACE_HEIGHT = 200;
	private static final double EYE_WIDTH = 50;
	private static final double EYE_HEIGHT = 50;
	private static final double MOUTH_WIDTH = 100;
	private static final double MOUTH_HEIGHT = 50;
	
	public void run(){
		drawHead();
		drawEyes();
		drawMouth();
	}
	
	private void drawHead(){
		GRect head = new GRect(FACE_WIDTH,FACE_HEIGHT);
		add(head, getWidth() / 2 - FACE_WIDTH / 2, getHeight() / 2 - FACE_HEIGHT / 2);
	}
	
	private void drawEyes(){
		GRect eye1 = new GRect(EYE_WIDTH,EYE_HEIGHT);
		add(eye1, getWidth() / 2 - FACE_WIDTH / 2 + 25, getHeight() / 2 - FACE_HEIGHT / 2 + 25);
		
		GRect eye2 = new GRect(EYE_WIDTH,EYE_HEIGHT);
		add(eye2, getWidth() / 2 + FACE_WIDTH / 2 - EYE_WIDTH - 25, getHeight() / 2 - FACE_HEIGHT / 2 + 25);
	}
	
	private void drawMouth(){
		GRect mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
		add(mouth, getWidth() / 2 - MOUTH_WIDTH / 2, getHeight() / 2 + FACE_HEIGHT / 2 - MOUTH_HEIGHT - 20);
	}
}