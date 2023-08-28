package exc;

public class Ex12 {

	public static void main(String[] args) {
		// 구구단의 일부분을 다음과 같이 출력하시오.
		//2*1=2 3*1=3 4*1=4
		//2*2=4 3*2=6 4*2=8
		//2*3=6 3*3=9 4*3=12
		//
		//5*1=5 6*1=6 7*1=7
		//5*2=10 6*2=12 7*2=14
		//5*3=15 6*3=18 7*3=21
		//
		//8*1=8 9*1=9
		//8*2=16 9*2=18
		//8*3=24 9*3=27
		
		for(int i = 1 ; i <= 9 ; i++)	{
			for(int j=1; j<=3; j++)	{
				int x = j+1+(i-1)/3*3;
				int y = i%3==0 ? 3 : i%3 ;
				if(x > 9)
					break;	//이게 없으면 x가 10 이상이 되어버림
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
//i=1
//j=1:x=2, j=2:x=3, j=3:x=4
//j=1:y=1, j=2:y=1, j=3:y=1
//2*1=2
//3*1=3
//4*1=4
			
//i=2
//j=1:x=2, j=2:x=3, j=3:x=4
//j=1:y=2, j=2:y=2, j=3:y=2
			
//i=3
//j=1:x=2, j=2:x=3, j=3:x=4
//j=1:y=3, j=2:y=3, j=3:y=3
			
//i=4
//j=1:x=2, j=2:x=3, j=3:x=4
//j=1:y=1, j=2:y=1, j=3:y=1
			
//i=5
//j=1:x=2, j=2:x=3, j=3:x=4
//j=1:y=2, j=2:y=2, j=3:y=2
			
//			 j:1,2,3
//i:1,2,3 => x:2,3,4	x=j+1+(i-1)/3*3 이때는 j+1만 살아남음
//i:4,5,6 => x:5,6,7	
//i:7,8,9 => x:8,9,10
			
//i:1,4,7 => y:1	y = i%3==0 ? 3 : i%3 (y는 i에만 영향을 받음)
//i:2,5,8 => y:2
//i:3,6,9 => y:3

			System.out.println();
			if(i%3==0) System.out.println();
		}
		
//		int dan, i, j, k;
//		for(i=1; i<=3; i++)	{
//			for(dan=2;dan<=9; dan++)	{
//				System.out.print(String.format("%d*%d=%d\t", dan, i, dan*i));
//			}
//			System.out.println();
//		}
//		for(j=1; j<=3; j++)	{
//			for(dan=5;dan<=7;dan++)	{
//				System.out.print(String.format("%d*%d=%d\t", dan, j, dan*j));
//			}
//			System.out.println();
//		}
//		for(k=1; k<=3; k++)	{
//			for(dan=8;dan<=9;dan++)	{
//				System.out.print(String.format("%d*%d=%d\t", dan, k, dan*k));
//			}
//			System.out.println();
//		}
	}

}
