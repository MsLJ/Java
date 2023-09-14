import java.util.Random;

public class Machine {
	Random memory = new Random();
	int gameAns;
	int turn;

	public void start(Human h) {
		gameAns = thinkAns();
		System.out.println(gameAns);
		int userAns;
		for (int turn = 0; true; turn++) {
			userAns = ask(h);
			if (judge(gameAns, userAns)) {
				break;
			}

		}
		System.out.println(userAns);
		judge(gameAns, userAns);

	}

	public int ask(Human h) {
		System.out.print("뭐:");
		int ua = h.tellNumber();

		return (ua < 1 || ua > 10000) ? ask(h) : ua;
	}

	public int thinkAns() {

		return memory.nextInt(10000) + 1;
	}

	public boolean judge(int gameAns, int userAns) {
		if (gameAns == userAns) {
			System.out.println("정답");
			return true;

		} else if (gameAns > userAns) {
			System.out.println("up");
			return false;

		} else if (gameAns < userAns) {
			System.out.println("down");
			

		}
		return false;
	}
}
