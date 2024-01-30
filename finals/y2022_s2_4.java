package finals;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.program.Program;
import acm.util.RandomGenerator;

public class y2022_s2_4 extends GraphicsProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	int vx;
	int vy;
	GOval ball;
	JTextField leftField;
	JTextField rightField;
	int clicked = 0;
	boolean moving = true;
	
	public void init(){
		ball = new GOval(50, 50);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - 50 / 2, getHeight() / 2 - 50 / 2);
		vx = rgen.nextInt(-5, 5);
		vy = rgen.nextInt(-5, 5);
		leftField = new JTextField(10);
		add(leftField, SOUTH);
		rightField = new JTextField(10);
		add(rightField, SOUTH);
		leftField.addActionListener(this);
		rightField.addActionListener(this);
		addMouseListeners();
	}
	public void run(){
		while (true){
			
			if(ball.getX() + 50 >= getWidth()){
				vx = -vx;
				ball.setLocation(getWidth() - 50, ball.getY());
			}
			if(ball.getY() + 50 >= getHeight()){
				vy = -vy;
				ball.setLocation(ball.getX(), getHeight() - 50);
			}
			if(ball.getX() <= 0){
				vx = -vx;
				ball.setLocation(0, ball.getY());
			}
			if(ball.getY() <= 0){
				vy = -vy;
				ball.setLocation(ball.getX(), 0);
			}
			if(moving){
				ball.move(vx, vy);
			}
			pause(10);
		}	
	}	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == leftField){
			vx = Integer.parseInt(e.getActionCommand());
		}
		if(e.getSource() == rightField){
			vy = Integer.parseInt(e.getActionCommand());
		}
	}
	
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == ball){
			clicked++;
		}	else clicked = 0;
		if(clicked == 3 && moving == true){
			moving = false;
			clicked = 0;
		}
		if(clicked == 2 && moving == false){
			clicked = 0;
			moving = true;
		}
	}
	
}
