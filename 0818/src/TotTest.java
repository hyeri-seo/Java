import java.util.Scanner;
public class TotTest {

	public static void main(String[] args) {
		//0이 아닌 값을 누르면 계속 실행이 되어야 함
		//메뉴를 누른 게 0이 아니면 돈을 입력받은 걸로 나올 거얌
		//0이면 종료되게 만들 거얌
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;	//메뉴 번호
		int money = 0;	//사용자가 입력한 돈
		int[] coins = {5000,1000,500};	//거슬러 줄 수 있는 돈, 자판기 안에 있는 돈
		int[] price = {1500, 2500, 2500, 2000, 3000};
		//얘 이용해서 잔돈 출력
		
//		int x = 0;	//거스름돈
//		int[] NumOfCoin = new int[price.length];
//		int i =0;
		
		while(true) {
			System.out.println("[코스타 카페]");
			System.out.println("1. 아메리카노(1500원)");
			System.out.println("2. 카페라떼(2500원)");
			System.out.println("3. 카푸치노(2500원)");
			System.out.println("4. 에스프레소(2000원)");
			System.out.println("5. 카페모카(3000원)");
			System.out.println("0. 종료");
			System.out.print("메뉴를 선택하세요>");
			sel = sc.nextInt();
			if(sel==0) break;
			System.out.print("돈을 넣으세요>");
			money = sc.nextInt();
			
			
//			for(i=0; i<price.length; i++) {
//				if(sel == i+1)	{
//					x = money-price[i];
//				} else {
//					continue;
//				}
//			}
//			if(x>=0)	{
//				for(i=0; i<price.length; i++) {
//					if(i==0)	{
//						NumOfCoin[0] += x/coins[0];
//					} else	{
//						NumOfCoin[i] += (x%coins[i-1])/coins[i];
//					}
//				}
//				System.out.println("잔돈:"+coins[0]+"("+NumOfCoin[0]+")");
//			} else {
//				System.out.println("돈이 부족합니다.");
//			}
			if(money<price[sel-1]) {
				System.out.println("돈이 부족합니다.\n");
				continue;
			}
			int change = money - price[sel-1];
			System.out.print("잔돈: ");
			for(int i=0; i<coins.length; i++) {
				int cnt = change/coins[i];
				if(cnt>0) {
					System.out.print(String.format("%d(%d)", coins[i], change/coins[i]));
				}
				change %= coins[i];
			}
			System.out.println("\n");
		}
	}

}
//1. 입금이 가격보다 작을 경우: 돈이 부족합니다.
//2. 잔돈: 500(1), 100(0), 50(0), 10(0)
//
