package ch04;

public class Ex4_10 {

	public static void main(String[] args) {
		//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
		//(1)에 알맞은 코드를 넣으시오.
		int num = 12345;
		int sum = 0;
		//1.2345
		//12.345, 123.45, 1234.5, 12345 10으로 나눈 나머지
		sum = num/10000+(num/1000)%10+(num/100)%10+(num/10)%10+num%10;
		System.out.println("sum="+sum);

	}

}
