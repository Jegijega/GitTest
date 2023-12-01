import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class christmastree extends GraphicsProgram {
	private static final int HEIGHT = 300;
	private static final int N_OF_BRANCH = 10;
	private static final int FIRST_BRANCH_WIDTH = 80;
	private static final int BRANCH_WIDTH_DIF = FIRST_BRANCH_WIDTH / N_OF_BRANCH;
	private static final int DIF_BRANCH = HEIGHT / N_OF_BRANCH ;
	private static final int WOOD_HEIGHT = 50;
	private static final int WOOD_WIDTH = 45;
	public void run() {
		drawWood();
		drawLefthalf();
	}
	private void drawLefthalf() {
		for (int i = 0; i < N_OF_BRANCH; i++) {
			GLine line1 = new GLine (getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT - DIF_BRANCH * i, 
					getWidth() / 2 - WOOD_WIDTH / 2 - FIRST_BRANCH_WIDTH + BRANCH_WIDTH_DIF * i , getHeight() - WOOD_HEIGHT - DIF_BRANCH * i);
			add (line1);
			GLine line2 = new GLine (getWidth() / 2 - WOOD_WIDTH / 2 - FIRST_BRANCH_WIDTH + BRANCH_WIDTH_DIF * i , getHeight() - WOOD_HEIGHT - DIF_BRANCH * i,
					getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT - DIF_BRANCH - DIF_BRANCH * i);
			add (line2);
		}
	}
	private void drawWood() {
		GRect woody = new GRect (WOOD_WIDTH, WOOD_HEIGHT);
		add (woody, getWidth() / 2 - WOOD_WIDTH / 2, getHeight() - WOOD_HEIGHT);
		woody.setFilled(true);
		woody.setColor(Color.MAGENTA);
		}
}
