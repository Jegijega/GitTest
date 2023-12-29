package Midterms;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class scorecounter2017 extends GraphicsProgram{
	private int BOX_SIZE = 200;
	private GLabel LABEL;
	private int score = 0;
	private String scoreStr = "";
	private int startX; 
	
	public void run(){
		drawBox();
		addlabel();
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		startX = e.getX();
	}
	
	public void mouseReleased(MouseEvent e){
		if(startX > e.getX()){
			remove(LABEL);
			scoreStr += score;
			LABEL = new GLabel(scoreStr);
			add(LABEL, getWidth() / 2.0 - LABEL.getWidth() / 2.0, getHeight() / 2.0 + LABEL.getAscent() / 2.0);
		}
	}

	private void addlabel() {
		scoreStr += score;
		LABEL = new GLabel(scoreStr);
		add(LABEL, getWidth() / 2.0 - LABEL.getWidth() / 2.0, getHeight() / 2.0 + LABEL.getAscent() / 2.0);
	}

	private void drawBox() {
		GRect rect = new GRect(BOX_SIZE, BOX_SIZE);
		rect.setFilled(true);
		rect.setFillColor(Color.WHITE);
		add(rect, getWidth() / 2.0 - BOX_SIZE / 2.0, getHeight() / 2.0 - BOX_SIZE / 2.0);
	}
}
