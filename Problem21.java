import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		for(int i = 0; i < 10; i++ ){
			drawingLines(i);
		}
	}
	
	private void drawingLines(double X){
		GLine line = new GLine(X * getWidth() / 9, 0 , X * getWidth() / 9, getHeight());
		add (line);
	}
}
