import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.Program;
import acm.util.ErrorException;

public class Problem67 extends Program {
	private JTextField field;
	public void run() {
		field = new JTextField(10);
		add(field, SOUTH);
		field.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == field){
				try{
					GImage image = new GImage (e.getActionCommand());
//					add(image, CENTER);
				}catch(ErrorException ex){
					println("no such image");
				}
			}
	}
}
