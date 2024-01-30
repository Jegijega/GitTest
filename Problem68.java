import java.awt.event.ActionEvent;

import javax.swing.*;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.program.Program;

public class Problem68 extends Program{
	private JTextField field;
	private JButton button;
	public void run(){
		field = new JTextField (10);
		add(field, SOUTH);
		button = new JButton ("Enter");
		add(button, SOUTH);
		field.addActionListener(this);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			JLabel label = new JLabel(field.getText());
			add(label, CENTER);
		}
	}
}
