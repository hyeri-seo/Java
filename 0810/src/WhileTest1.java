
public class WhileTest1 {

	public static void main(String[] args) {
		int dan=2, i=1;
		while (i<=9)	{	//while은 조건만 들어감. for문은 변수 선언을 안에서
			System.out.println(String.format("%dx%d=%2d", dan, i, dan*i));
			i++;
		}
	}

}
