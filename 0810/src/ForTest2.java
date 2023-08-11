
public class ForTest2 {

	public static void main(String[] args) {
		int dan, i;
		for(i=1; i<=9; i++)	{
			for(dan=2;dan<=9;dan++)	{
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan*i));
			}
			System.out.println();
		}

	}
}

/*
2x1=2	3x1=3	4x1=4	...	9x1=9
2x2=4	3x2=6	4x2=8	
2x3=6
.
.
.
2x9=18					...	9x9=81
*/