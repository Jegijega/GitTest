import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem70 extends GraphicsProgram{
	public void run(){
		update();
		addComponentListeners(this);
	}
	public void ComponentResized(ComponentEvent e){
		update();
	}

	private void update() {
		removeAll();
		for(int i = 0; i < 10; i++){
			GLine line = new GLine(i * getWidth() / 10, 0, i * getWidth() / 10, getHeight());
			add(line);
		}
		for(int i = 0; i < 10; i++){
			GLine line = new GLine( 0, i * getHeight() / 10, getWidth(), i * getHeight() / 10);
			add(line);
		}
	}
}
