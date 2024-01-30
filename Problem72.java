import java.awt.event.ActionEvent;

import javax.swing.*;

import acm.program.ConsoleProgram;

public class Problem72 extends ConsoleProgram{
	private JTextField fieldTeacher;
	private JTextField fieldSubj;
	private JTextField fieldPupil;
	private JButton buttonTeacher;
	private JButton buttonSubj;
	private JButton buttonPupil;
	private JButton buttonDispPup;
	private JButton buttonDispTeach;
//	private School sch = new School();
	public void init(){
		JLabel labelTeach = new JLabel("Teach:");
		add(labelTeach, SOUTH);
		fieldTeacher = new JTextField(10);
		add(fieldTeacher, SOUTH);
		JLabel labelSubj = new JLabel("Subj:");
		add(labelSubj, SOUTH);
		fieldSubj = new JTextField(10);
		add(fieldSubj, SOUTH);
		JLabel labelPupil = new JLabel("Pupil:");
		add(labelPupil, SOUTH);
		fieldPupil = new JTextField(10);
		add(fieldPupil, SOUTH);
		buttonTeacher = new JButton("add Teach");
		add(buttonTeacher, SOUTH);
		buttonSubj = new JButton("add Subj");
		add(buttonSubj, SOUTH);
		buttonPupil = new JButton("add Pupil");
		add(buttonPupil, SOUTH);
		buttonDispPup = new JButton("Display Pupils");
		add(buttonDispPup, SOUTH);
		buttonDispTeach = new JButton("Display Teachers");
		add(buttonDispTeach, SOUTH);
		fieldTeacher.addActionListener(this);
		fieldSubj.addActionListener(this);
		fieldPupil.addActionListener(this);
		buttonTeacher.addActionListener(this);
		buttonSubj.addActionListener(this);
		buttonPupil.addActionListener(this);
		buttonDispPup.addActionListener(this);
		buttonDispTeach.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttonTeacher){
//			sch.addTeacher(fieldTeacher.getText());
		}else if(e.getSource() == buttonSubj){
//			sch.addSubject(fieldTeacher.getText(), fieldSubj.getText());
		}else if(e.getSource() == buttonPupil){
//			sch.addPupil(fieldPupil.getText(), fieldSubj.getText());
		}
		fieldTeacher.setText("");
		fieldSubj.setText("");
		fieldPupil.setText("");
	}
}
