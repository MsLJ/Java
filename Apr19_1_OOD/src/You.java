import java.util.Random;

//공통속성:static
//기본값:constructor
public class You {
	Random brain;

	public You() {
		brain = new Random();
	}

	public int fire() {
		
		return brain.nextInt(3) + 1;
	}

}
