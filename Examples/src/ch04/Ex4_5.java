package ch04;

public class Ex4_5 {

	public static void main(String[] args) {
		// for문을 while문으로 변경하시오.
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
		int i=0;
		int j=0;
		while(i<=10)	{
			while(j<=i)	{
				System.out.print("*");
			} j++;
			System.out.println();
		} i++;
			

	}

}
