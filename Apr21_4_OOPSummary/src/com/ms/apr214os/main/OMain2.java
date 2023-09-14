package com.ms.apr214os.main;




import javax.swing.JButton;
import javax.swing.JFileChooser;
//JFrame클래스는 있어->만들지 말고
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.ms.apr214os.hero.Hulk;

public class  OMain2 {

	//
	
//awt/swing(Java GUI프로그래밍)
//	1)웹기반으로 바꾸는 중
//	2)윈도우프로그램:c#->winSDK
//	3)웹,BD/AI에 1도 도움이 안됨:Android에는 도움이 되는데

	
	
	public static void main(String[] args) {
		//제목이 지구인 JFrame
		JFrame p= new JFrame("지구");
		
		//텍스트가 홍길동인 JBUtton
		JButton b=new JButton("홍길동");
		//텍스트가 홍길동인 JTextField
		//JTextField f=new JTextField("홍길동");
		//JFileChooser c= new JFileChooser();
		
		//저 JFrame에 저 JButton 추가
		p.add(b);
		//이벤트 처리를 하자
		//반드시 attack()이 필요: Hero interface[사수]
		//반드시 actionPerformed():ActionListener interface[Java]
		
		//영웅이 아이언맨
		//ActionListener인 헐크
		Hulk i=new Hulk();
		
		//저 JButton이 담당 ActionListener 찜하는거
		b.addActionListener(i);
		
		//도움요청 ->클릭
		
		
		//영웅들은 반드시 공격하기 기능이->interface
		
		//그 JFrame 사이즈가 500,300
		p.setSize(500, 300);
		
		//그 JFrame 보이게
		p.setVisible(true);
		
		
		
		
		
	}

}
