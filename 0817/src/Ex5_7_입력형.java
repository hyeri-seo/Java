import java.util.Scanner;

public class Ex5_7_입력형 {

	public static void main(String[] args) {
		// 문제 5-6에 동전의 개수를 추가한 프로그램이다.
		// 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
		// 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름돈이 부족합니다.’라고 출력하고 종료한다.
		// 지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
		// (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
			Scanner sc = new Scanner(System.in);
			System.out.print("거스름돈:");
		
			 // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			int money = sc.nextInt();
			
			System.out.println("money="+money);
			
			int[] coinUnit = {500, 100, 50, 10 }; 		// 동전의 단위
			int[] coin = {5, 5, 5, 5}; 					// 갖고 있는 단위별 동전의 개수. 3170원: 500원 5개, 100원 5개, 50원 3개, 10원 2개 필요
			for(int i=0;i<coinUnit.length;i++) {
				int coinNum = 0;
				
				//1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
				coinNum = money/coinUnit[i];			//거슬러줘야 하는 500원/100원/50원/10원의 개수
				//500원의 개수: 6개, 100원의 개수: 1개, 50원의 개수: 1개, 10원의 개수: 2개
				
				//2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (거슬러주고 남은 500원/100원/50원/10원의 개수)
				if(coin[i] >= coinNum)	{
					coin[i] -= coinNum;					//남은 동전의 개수를 구해야 하니까
				} else	{
					coinNum = coin[i];
					coin[i] = 0;
				}
				//coinNum = money/coinUnit[i]>coin[i]?money/coinUnit[i]:coin[i]; 이렇게 해도 됨
				
				//3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
				money -= coinNum*coinUnit[i];
				
				System.out.println(coinUnit[i]+"원: "+coinNum);
			}
			if(money > 0) {
				System.out.println("거스름돈이 부족합니다.");
				System.exit(0); // 프로그램을 종료한다.
			}
			
			System.out.println("=남은 동전의 개수 =");
			
			for(int i=0;i<coinUnit.length;i++) {
				System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
		
	}

}
