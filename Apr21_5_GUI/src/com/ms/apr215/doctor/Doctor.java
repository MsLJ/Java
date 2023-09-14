package com.ms.apr215.doctor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Doctor implements ActionListener {
	private JTextField na;
	private JTextField he;
	private JTextField we;
	private JLabel resultB;

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(JTextField na, JTextField he, JTextField we, JLabel resultB) {
		super();
		this.na = na;
		this.he = he;
		this.we = we;
		this.resultB = resultB;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("누름");
		String name=na.getText();
		String weight=we.getText();
		String height=he.getText();
		double height2=Double.parseDouble(height);
		double weight2=Double.parseDouble(weight);
		String result=String.format(height, "");
		resultB.setText(result);
		// TODO Auto-generated method stub

	}

}
