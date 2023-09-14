//객체간의 관계
//		사람 has String:이름
//		사람 has a String:주소
//		사람 has a 개:반려동물
//		개 has a 사람:주인
public class OMain {
	
	
	public static void main(String[] args) {
		Dog d=new Dog(3,"후추");
		d.printInfo();
		System.out.println("---------");
		
		
		
		Human h=new Human("홍길동","수원",d);
		h.printInfo();
		System.out.println("----------");
		System.out.println(h.name);//사람 이름
		System.out.println(h.adress);//사람 집
		System.out.println(h.age);//사람의 반려동물
		System.out.println(h.pet.name);//사람의 반려둥물의 이름
		
		
		
		
		
		
		//개
		//	이름이 후추
		//	나이가 3살
		//	그 개 정보출력
		//----------------
		//이름이 홍길동,집이 수원인 사람
		//그 사람 정보출력
		
	}

}
