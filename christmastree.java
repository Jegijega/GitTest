import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class christmastree extends GraphicsProgram {
	private static final int HEIGHT = 500;
	private static final int N_OF_BRANCH = 10;
	private static final int FIRST_BRANCH_WIDTH = 70;
	private static final int BRANCH_WIDTH_DIF = FIRST_BRANCH_WIDTH / N_OF_BRANCH;
	private static final int DIF_BRANCH = HEIGHT / N_OF_BRANCH ;
	private static final int WOOD_HEIGHT = 50;
	private static final int WOOD_WIDTH = 45;
	public void run() {
		drawWood();
		drawLefthalf();
	}
	private void drawLefthalf() {
		GLine line1 = new GLine (getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT, getWidth() / 2 - WOOD_WIDTH / 2 - FIRST_BRANCH_WIDTH , getHeight() - WOOD_HEIGHT );
		add (line1);
	}
	private void drawWood() {
		GRect woody = new GRect (WOOD_WIDTH, WOOD_HEIGHT);
		add (woody, getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT);
		woody.setFilled(true);
		woody.setColor(Color.MAGENTA);
		}
}
