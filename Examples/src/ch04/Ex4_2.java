package ch04;

public class Ex4_2 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		// '반복'해서 더해야 하니까 for문 쓰기
		int sum = 0;
		int x;
		for(x=1; x<=20; x++)	{
			if(x%2!=0 && x%3!=0)	{
				sum+=x;
			}
		}	System.out.println(sum);

	}

}
