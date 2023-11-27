import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.program.*;

public class Problem42 extends GraphicsProgram {
	private int countClick = 0;
	private GLine line = null;
	private int stX;
	private int stY;
	private boolean finished = false;
	public void run() {
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		if(line != null && !finished){
			remove(line);
			line = new GLine(stX, stY, e.getX(), e.getY());
			add(line);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		countClick++;
		if(countClick == 1){
			stX = e.getX();
			stY = e.getY();
			line = new GLine(stX, stY, stX, stY);
			
			add(line);
		}else if(countClick == 2){
			finished = true;
		}
	}
	
	

}