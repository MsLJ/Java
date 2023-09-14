package com.ms.apr284ucc.main;

import java.util.ArrayList;
import java.util.Comparator;

import com.ms.apr284ucc.student.Student;

//학생 성적관리:int[][]...

public class UCCMain2 {
	public static void main(String[] args) {
		Student s = new Student("짐로로", 80, 90, 12);
	

		ArrayList<Student> students = new ArrayList<>();
		students.add(s);
		students.add(new Student("뽀로로", 100, 100, 100));
		students.add(new Student("홍로로", 10, 15, 70));
		students.add(new Student("고로로", 60, 50, 80));
		students.add(new Student("ㅋ로로", 70, 90, 30));
			//첫번쨰 학생 국어점수
		System.out.println(students.get(0).getKor());
		
		//학생 총 몇명
		System.out.println(students.size());
		
		//두번째 학생 수학점수 0점으로 수정
		students.get(1).setMath(0);
		System.out.println(students.get(1).getMath());
		
		//이름 가나다순 정렬
		Comparator<Student> c= new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String o1Name=o1.getName();
				String o2Name=o2.getName();
				return o1Name.compareTo(o2Name);
			}
		};
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Sum=(int) (o1.getEng()+o1.getKor()+o1.getMath());
				Integer o2Sum=(int) (o2.getEng()+o2.getKor()+o2.getMath());
				return o2Sum.compareTo(o1Sum);
			}
		});
		students.get(0).printInfo();
		//1등 학생 정보출력
		
		
		
		
		
		//전체 학생 정보출력
//		students.get(i).printInfo()
//		for (Student student : students) {
//			student.printInfo();
//		}
	
	
	
	
	}
	

}
