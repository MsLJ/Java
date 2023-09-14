import java.util.*;

class test{
	public int solution(int n) {
		int answer = 0;
		int[] q = {100000000, 10000000, 1000000, 100000, 10000, 1000, 100,10};
		for (int i = 0; i < q.length; i++) {
			int j = q[i];
			answer +=(n / j);

			if (i > 0 && n/j >= 1) {
				int c = n % q[i - 1];
				answer += c / j;
			}
            if(i==q.length-1){
                answer+=n%j;
            }

			
		}
		return answer;
	}
}
