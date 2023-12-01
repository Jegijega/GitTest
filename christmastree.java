import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class christmastree extends GraphicsProgram {
	private static final int HEIGHT = 500;
	private static final int N_OF_BRANCH = 10;
	private static final int DIF_BRANCH = HEIGHT / N_OF_BRANCH ;
	private static final int WOOD_HEIGHT = 50;
	private static final int WOOD_WIDTH = 45;
	public void run() {
		drawWood();
	}
	private void drawWood() {
		GRect woody = new GRect (WOOD_WIDTH, WOOD_HEIGHT);
		add (woody, getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT);
		woody.setFilled(true);
		woody.setColor(Color.ORANGE);
		}
}
