package com.ms.apr215.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import com.ms.apr215.doctor.Doctor;

//비만도 BMI
//Layout:입주전력
public class GMain {
	public static void main(String[] args) {
		//JFrame:윈도우 프로그램 바탕이 되는 판
		JFrame j=new JFrame("BMI");
		
		GridLayout gr=new GridLayout(4, 2);
		j.setLayout(gr);
		
		
		JLabel na=new JLabel("이름:");
		j.add(na);
		JTextField f=new JTextField();
		j.add(f);
		
		JLabel we=new JLabel("몸무게:");
		j.add(we);
		JTextField f2=new JTextField();
		j.add(f2);
		
		JLabel he=new JLabel("키:");
		j.add(he);
		JTextField f3=new JTextField();
		j.add(f3);
		
		
		JLabel resultB=new JLabel("결과");
		j.add(resultB);
		JButton re=new JButton("확인");
		j.add(re);
		
		Doctor d= new Doctor(f,f2,f3,resultB);
		re.addActionListener(d);
		
		
		//텍스트가 몸무게:인JLabel
		//추가
		
		
		//JTextField
		//프레임에 추가
		
		//텍스트가 키:인 JLabel
		//추가
		
		//텍스트가 확인 인 JButton
		//추가
		
		
		
		
		j.setSize(600, 500);
		
		j.setVisible(true);
		//사이즈
		
		//보이게
		
	}

}
