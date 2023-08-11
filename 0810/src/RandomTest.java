
public class RandomTest {

	public static void main(String[] args) {
		// 0.0 <= Math.random()
		// 0.0*45 <= Math.random()
		// 1 <= (int)(Math.random()*45)+1 < 46
		int ball = (int)(Math.random()*45)+1
		System.out.println(ball);
	}

}
