package com.ms.apr284ucc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import com.ms.apr284ucc.student.Student;
import com.ms.apr284ucc.subway.StationInfo;

public class UCCMain3 {
	// 2015/01/01~2022/12/31까지 서울 지하철 운행정보
	// 가장 이용객수(탄+내린)가 많았던 건
	// 언제 몇호선 무슨역
	// 일단 엑셀파일에 있는걸 여기로 불러오고 여기에 읽게 해주는작업?
	//	=>순서개념으로 정렬
	
	// Collection
	// 		List계열:가변사이즈 배열
	// 		Set계열:?
	// 		Map계열:?
	public static void main(String[] args) {
		FileInputStream fis;
		BufferedReader br = null;
		try {

			StationInfo sb = new StationInfo();
			// 불러냈고 그안에 있는 내용물들을 분리해줘야할 클래스가 필요하지 않을까?
			fis = new FileInputStream("C:\\lee\\work space\\subway.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			String line = null;
			StationInfo si = null;
			//총 데이터수를 몰라서,배열을 못만들겠고
//			StationInfo[]sis=new StationInfo[];
			

			ArrayList<StationInfo>sis= new ArrayList<>();//배열만들고

			while ((line = br.readLine()) != null) {
				si=new StationInfo(line);
				sis.add(si);//배열 만든곳에 저장
				}

				
				sis.sort(new Comparator<StationInfo>() {

					@Override
					public int compare(StationInfo o1, StationInfo o2) {
						Integer o1Sum=o1.getIpeople()+o1.getAlight();
						Integer o2Sum=o2.getIpeople()+o2.getAlight();
						
						return o2Sum.compareTo(o1Sum);
					}
					
				});
				sis.get(0).printInfo();

			

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
