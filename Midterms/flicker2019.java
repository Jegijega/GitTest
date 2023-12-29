package Midterms;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class flicker2019 extends GraphicsProgram{
	private static final int CIRCLE_D = 40;
	private static final int DELAY = 300;
	
	private boolean done = false;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval circle;
	
	public void init(){
		addMouseListeners();
	}
	
	public void run(){
		while(true){
			if(done){
				coloring();
			}
			pause(1);
		}	
	}
	
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == null){
			GOval oval = new GOval (CIRCLE_D, CIRCLE_D);
			oval.setColor(rgen.nextColor());
			oval.setFilled(true);
			add(oval, e.getX() - CIRCLE_D / 2, e.getY() - CIRCLE_D / 2);
		}else{
			circle = (GOval)getElementAt(e.getX(), e.getY());
			done = true;
		}
	}

	private void coloring() {
		while(circle.getColor() != Color.GREEN){
			circle.setColor(randColor());
			pause(DELAY);
		}
	}

	private Color randColor() {
		int rand = rgen.nextInt(1, 5);
		if(rand == 1){
			return Color.GREEN;
		}
		if(rand == 2){
			return Color.RED;
		}
		if(rand == 3){
			return Color.BLUE;
		}
		if(rand == 4){
			return Color.BLACK;
		}
		return Color.YELLOW;
	}
}
