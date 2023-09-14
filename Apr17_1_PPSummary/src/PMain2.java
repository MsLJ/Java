import java.util.Arrays;
import java.util.Random;

public class PMain2 {
	public static int pick(int pos, int[] lotto) {
		Random r = new Random();
		int n = r.nextInt(6) + 1;
		for (int i = 0; i < pos; i++) {
			if (n == lotto[i]) {
				return pick(pos, lotto);

			}

		}
		return n;

	}

	public static void main(String[] args) {

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = pick(i, lotto);

		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.println(i);
		}
	}

	// 로또 번호 자동
	// 1~45사이의 중복없는 랜덤한 숫자6개
	// 정렬
	// 중복검사 3번째거 뽑을때 1번체크,2번체크...
	// 기존숫자들 저장되어있어야,하나하나 비교=>int[]
	// lotto[0]=그냥
	// lotto[1]=0번이랑 중복됐나

}
