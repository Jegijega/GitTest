package Midterms;

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class zigzag2021 extends GraphicsProgram{
	
	private double lastX = 0;
	private double lastY = 0;
	private GLine lastLine = null;
	private boolean dragged = true;
	
	public void run(){
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		add(new GLine(lastX, lastY, e.getX(), e.getY()));
		lastX = e.getX();
		lastY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e){
		dragged = false;
		if (lastLine != null){
			remove(lastLine);
		}
		lastLine = new GLine (lastX, lastY, e.getX(), e.getY());
		add(lastLine);
	}
	
	public void mouseReleased(MouseEvent e){
		if(!dragged){
			lastX = e.getX();
			lastY = e.getY();
		}
		dragged = true;
		lastLine = null;
	}
}
