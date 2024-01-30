import java.util.ArrayList;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem69 extends GraphicsProgram{
	public void run(){
		ArrayList<GLabel> list = new ArrayList<>();
		for(int i = 0; i < 100; i++){
			GLabel label = new GLabel ("I am new");
			add(label, getWidth() / 2 - label.getWidth() / 2, getHeight());
			list.add(label);
			for(int j = 0; j < list.size(); j++){
				list.get(j).move(0, -10);
				if(getElementAt(getWidth() / 2, getHeight() / 2) != null){
					getElementAt(getWidth() / 2, getHeight() / 2).setVisible(false);;
				}
				pause(10);
			}
		}
	}
}
