import java.lang.reflect.Array;
import java.util.Arrays;//Arrays.sort하기위해
import java.util.Collections;

public class Sort {
	  public long solution(long n) {
	       //정수 내림차순으로 정렬
		  long answer = 0;
	        String[]nn=Long.toString(n).split(""); //배열 만들어서 ""기준 하나씩 넣고
	        Arrays.sort(nn,Collections.reverseOrder());//
	        String nnn=String.join("", nn);
	        answer=Long.parseLong(nnn);
	        
	        
	       
	        
	        
	        
	        
	        return answer;
	    }

}
