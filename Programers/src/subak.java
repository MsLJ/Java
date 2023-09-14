
public class subak {
	public String solution(int n) {
        String answer = "";
        int i=0;
        while(answer.length()<n) {
        	i++;
        	if (i%2==0) {
        		answer+="박";
				
			}else {
				answer+="수";
			}
        	
        }
        return answer;
    }

}
