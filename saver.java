/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;

public class saver extends GraphicsProgram {	
	private static final double DIAMETERL = 72;
	private static final double DIAMETERM = 72 / 2.54 * 1.65;
	private static final double DIAMETERS = 72 / 2.54 * 0.76;
	private static final double FRAMEX = 150;
	private static final double FRAMEY = 100;
	private static final double SHOTSIZE = 7;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int score = 0;
		drawingBackground();
		drawingFrame();
		paint(Color.RED,DIAMETERL);
		paint(Color.WHITE,DIAMETERM);
		paint(Color.RED,DIAMETERS);
		for(int i = 0; i < 3; i++){
		drawingShots();
		}
	}
	
	private void drawingShots(){
		double rand1 = rgen.nextDouble(getWidth() / 2 - FRAMEX / 2, getWidth() / 2 + FRAMEX / 2);
		double rand2 = rgen.nextDouble(getHeight() / 2 - FRAMEY / 2, getHeight() / 2 + FRAMEY / 2);
		drawX(rand1, rand2);
		
	}
	
	private void drawX(double rand1, double rand2){
		GLine X1 = new GLine(rand1 - SHOTSIZE / 2, rand2 - SHOTSIZE / 2, rand1 + SHOTSIZE / 2, rand2 + SHOTSIZE / 2);
		add(X1);
		X1.setColor(Color.GREEN);
		GLine X2 = new GLine(rand1 + SHOTSIZE / 2, rand2 - SHOTSIZE / 2, rand1 - SHOTSIZE / 2, rand2 + SHOTSIZE / 2);
		add(X2);
		X2.setColor(Color.GREEN);
		
	} 
	
	private void drawingBackground(){
		GRect background = new GRect (getWidth(), getHeight());
		add(background, 0, 0);
		background.setFilled(true);
		background.setColor(Color.DARK_GRAY);
	}
	
	private void drawingFrame(){
		GRect frame = new GRect(FRAMEX, FRAMEY);
		add(frame, getWidth() / 2 - FRAMEX / 2, getHeight() / 2 - FRAMEY / 2);
		frame.setFilled(true);
		frame.setColor(Color.BLACK);
		drawingRopes(0);
		drawingRopes(1);
	}
	
	private void drawingRopes(int hole){
		GLine rope = new GLine(getWidth() / 2 - FRAMEX / 2 + hole * FRAMEX, 0, getWidth() / 2 - FRAMEX / 2 + hole * FRAMEX, getHeight() / 2 - FRAMEY / 2);
		add(rope);
	}
	
	private void paint(Color color, double rad){
		GOval BRed = new GOval(rad, rad);
		add(BRed, getWidth() / 2 - rad / 2, getHeight() / 2 - rad / 2);
		BRed.setFilled(true);
		BRed.setColor(color);
	}
}