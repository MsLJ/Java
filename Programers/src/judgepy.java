
public class judgepy {
    boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
     char ar[]=s.toCharArray();
     //char배열이 애초에 한글자만 받을수있는 배열이기에 s를 char array로 하면 배열에 한 글자씩 담을것
     //그렇기에 char배열에는 "이 아닌 '을 써야(char[]=1byte)빨간줄 오류가 생기지 않는것
     
     for (int i = 0; i < s.length(); i++) {
		char c = ar[i];
		if (c=='p'||c=='P') {
			p++;
			
		}else if(c=='y'||c=='Y') {
			y++;
		}
		
	}
     if (p!=y) {
    	 answer=false;
		
	}
       
     return answer;
       
        
    }
}
