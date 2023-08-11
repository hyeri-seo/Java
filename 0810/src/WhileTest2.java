
public class WhileTest2 {

	public static void main(String[] args) {
		int dan, i;
		for(i=1; i<=9; i++) {
			dan=2;
			while(dan<=9)	{
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan*i));
				dan++;
			}
			System.out.println();
			i++;
		}
	}

}
