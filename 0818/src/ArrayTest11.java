import java.util.*;
public class ArrayTest11 {

	public static void main(String[] args) {
		// 100 미만의 양의 정수들이 주어진다.
		// 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
		// 그때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지
		// 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
		// 입력: 10 55 3 63 85 61 85 0
		// 출력:
		// 0인 거-1개
		// 1인 거-1개
		// 5인 거-1개
		// 6인 거-2개
		// 8인 거-2개
		int[] cnt = new int[10];
		Scanner sc = new Scanner (System.in);
		int input = 0;
		
		do {
				input = sc.nextInt();
				
				cnt[input/10]++;
				
			} while(input!=0);
		
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i]+"\t");
		}
	}

}
