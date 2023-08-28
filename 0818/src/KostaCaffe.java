import java.util.Scanner;
public class KostaCaffe {		//TotTest는 한 메뉴만. 이거는 여러 메뉴를 한 번에 선택할 수 있다. 거스름돈도 한 번에

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sel = 0;
		int money = 0;	//사용자가 입력한 돈
		int[] order = new int[10];	//최대 10개까지 주문받음. 10개 넘어가면 오류.
		int ordCnt = 0;				//order에 저장할 때 index 늘려주려고 적은 것
		int[] coins = {5000,1000,500};	//거슬러 줄 수 있는 돈, 자판기 안에 있는 돈
		int[] price = {1500, 2500, 2500, 2000, 3000};
		String[] menu = {"아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카"};
		
		while(true) {
			System.out.println("[코스타 카페]");
			for(int i=0; i<menu.length; i++) {
				System.out.println(String.format("%d. %s(%d원)", i+1, menu[i], price[i]));
			}
//			System.out.println("1. 아메리카노(1500원)");
//			System.out.println("2. 카페라떼(2500원)");
//			System.out.println("3. 카푸치노(2500원)");
//			System.out.println("4. 에스프레소(2000원)");
//			System.out.println("5. 카페모카(3000원)");
			System.out.println("0. 계산");
			System.out.print("메뉴를 선택하세요>");
			sel = sc.nextInt();
			if(sel==0) {
				for(int i=0; i<ordCnt; i++) {
					System.out.print(order[i]+",");
				}
			}
			System.out.println("0. 계산");
			System.out.print("선택>");
			if(sel==0) {
				int amount = 0;
				//1. 주문내역 보여주기
				System.out.print("주문내역: ");
				for(int i=0; i<ordCnt; i++) {
					System.out.print(menu[order[i]-1]+" ");
					amount += price[order[i]-1];
				}
				System.out.println("\n전체금액:"+amount);
				//2. 돈 입력받기
				System.out.print("돈을 넣으세요: ");
				money = sc.nextInt();
				
				//3. 돈이 부족하면 '돈이 부족합니다.'
				//4. 돈이 부족하지 않으면 잔돈 내어주기
				if(money<amount) {
					System.out.println("돈이 부족합니다.");
				} else {
					int change = money-amount;
					System.out.print("잔돈:");
					for(int i=0; i<coins.length; i++) {
						if(change/coins[i]!=0) {
							System.out.print(String.format("%d(%d) ", coins[i], change/coins[i]));
						}
						change %= coins[i];
					}
				}
				break;
			}
			order[ordCnt++] = sel;
		}
			
	} 

}
