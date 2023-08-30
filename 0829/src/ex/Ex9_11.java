package ex;

//커맨드라인으로 2~9사이의 두 개의 숫자를 받아서
//두 숫자사이의 구구단을 출력하는 프로그램을 작성하시오.
//예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.


public class Ex9_11 {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.\n"+"USAGE : GugudanTest 3 5");
		}
		
		int s = Integer.parseInt(args[0]);	//parseInt-문자열을 숫자로 변환
		int e = Integer.parseInt(args[1]);
		
		if(s>e) {
			int t = s;
			s = e;
			e = t;
		}
		
		if(s<2 || e>9) {
			System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.\n"+"USAGE : GugudanTest 3 5");
		}
		
		for(int i=s; i<=e; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(String.format("%d*%d=%d", i, j, i*j));
			}
			System.out.println();
		}
	}
}

//C:\jdk1.5\work>java Exercise9_11 2
//시작 단과 끝 단, 두 개의 정수를 입력해주세요.
//USAGE : GugudanTest 3 5
//
//C:\jdk1.5\work>java Exercise9_11 1 5
//단의 범위는 2와 9사이의 값이어야 합니다.
//USAGE : GugudanTest 3 5
//
//C:\jdk1.5\work\ch9>java Exercise9_11 3 5
//3*1=3
//3*2=6
//3*3=9
//3*4=12
//3*5=15
//3*6=18
//3*7=21
//3*8=24
//3*9=27

//4*1=4
//4*2=8
//4*3=12
//4*4=16
//4*5=20
//4*6=24
//4*7=28
//4*8=32
//4*9=36

//5*1=5
//5*2=10
//5*3=15
//5*4=20
//5*5=25
//5*6=30
//5*7=35
//5*8=40
//5*9=45