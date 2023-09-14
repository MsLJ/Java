
public class Collatz {
	public int solution(long num) {
        long answer = 0;
        while(num>1){
        	if (num%2==0) {
        		answer++;
        		num/=2;
				
			}else if(num%2==1) {
				answer++;
				num=(num*3)+1;
			}else if(answer>500) {
				return -1;
			}
            
        }
        return (int) answer;
    }

}
