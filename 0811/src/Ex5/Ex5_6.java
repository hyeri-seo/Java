package Ex5;

public class Ex5_6 {

	public static void main(String[] args) {
//		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
//		단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
//		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int sum = 0;
		System.out.println("money="+money);
		for(int i=0; i<coinUnit.length; i++) {
			/*
			 (1) 알맞은 코드를 넣어 완성하시오. */
			
	//			money/500 == 5, 나머지 180
	//			money/100 == 1, 나머지 80
	//			money/50 == 1, 나머지 30
	//			money/10 == 3, 나머지 0 여기에서 멈춰야 함
	//			이때 몫을 더해야 동전의 개수임 5+1+1+3			
			
			int j = money/coinUnit[i];
//			money = money%coinUnit[i];
			money = money - (coinUnit[i] * j);
			sum += j;
			
			System.out.println(coinUnit[i]+"원의 개수: "+j);
		}
		System.out.println("동전의 총 개수: "+sum);

		
	}//main

}

//몫이 동전의 개수. 나머지가 0이 되면 끝나는 거
//
