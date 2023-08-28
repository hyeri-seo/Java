package ch04;

public class Ex4_15 {

	public static void main(String[] args) {
		//다음은 회문수를 구하는 프로그램이다.
		//회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		//예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다.
		//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		
		int number = 12345; 
		int tmp = number; 
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			result = result*10+tmp%10;
			tmp /= 10;
			
//			result = 0, result = 5, tmp = 1234
//			result = 50+4, tmp = 123
//			result = 540+3, tmp = 12
//			result = 5430+2, tmp = 1
//			result = 54320+1, tmp = 0
//			이러면 number랑 12345는 다르므로 회문수가 아님			
			
		} 
		if(number == result)	{
		System.out.println( number + "는 회문수 입니다.");
		}
		else	{ 
		System.out.println( number + "는 회문수가 아닙니다.");
		}
	}

}
