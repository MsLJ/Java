import java.util.Arrays;
import java.util.Collections;

public class Sortmain {
	public static void main(String[] args) {
		//Arrays.sort를 이용하기 위해서는 String 배열로변환이 필요하고
		//Arrays.sort를  쓰게 된다면 오름차순으로 정렬 내림차순으로 할려면 ,Collections.reverseOrder()를 추가
		//그 후에 다시 배열을 String으로 하기위해서는 String.join을 사용하는게 필요
		long n=12345;
		long answer=0;
		String[]nn=Long.toString(n).split("");//현재 {"1","2","3","4","5"}으로 담겼을것
		for (String string : nn) {
			System.out.println(string);
		}
//		Arrays.sort(nn);//내림차순으로 정렬
		Arrays.sort(nn,Collections.reverseOrder());//오름차순으로 정렬
		String nnn=String.join("", nn);//String.join으로 배열을 String으로 형 변환
		System.out.println(nnn);
		answer=Long.parseLong(nnn); //그리고 다시 Long으로 형 변환
		System.out.println(answer);
	}

}
