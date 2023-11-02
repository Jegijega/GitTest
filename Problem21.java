import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		for(int i = 0; i < 10; i++ ){
			drawingLines(i);
		}
	}
	
	private void drawingLines(double X){
		GLine lineY = new GLine(X * getWidth() / 10, 0, X * getWidth() / 10, getHeight());
		add (lineY);
		GLine lineX = new GLine(0, X * getHeight() / 10, getWidth(),  X * getHeight() / 10);
		add (lineX);
	}
}
