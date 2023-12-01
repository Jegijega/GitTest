import acm.graphics.*;
import acm.program.GraphicsProgram;

public class christmastree extends GraphicsProgram {
	private static final int HEIGHT = 100;
	private static final int N_OF_BRANCH = 6;
	private static final int DIF_BRANCH = HEIGHT / N_OF_BRANCH ;
	private static final int WOOD_HEIGHT = 20;
	private static final int WOOD_WIDTH = 15;
	public void run() {
		drawWood();
	}
	private void drawWood() {
		GRect woody = new GRect (WOOD_WIDTH, WOOD_HEIGHT);
		add (woody, getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT);
		
	}
}
