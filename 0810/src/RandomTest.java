
public class RandomTest {

	public static void main(String[] args) {
		// 0.0 <= Math.random()
		// 0.0*45 <= Math.random()
		// 1 <= (int)(Math.random()*45)+1 < 46
		int ball = (int)(Math.random()*45)+1;	//Math.random은 0부터 1까지 중에서 뽑는 것임 그래서 *45 해도 많아야 45까지임
												//그래서 이거 실행하면 1부터 46까지 중에서 랜덤으로 뽑는 거임
		System.out.println(ball);
	}

}
