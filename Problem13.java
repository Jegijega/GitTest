import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem13 extends GraphicsProgram{
	public void run(){
		double h = getHeight() / 2;
		GLine line = new GLine(0, h, getWidth(),h);
		add(line);
	}
}

