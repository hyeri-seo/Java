import java.util.Scanner;

public class ArrayTest15 {

	public static void main(String[] args) {
/*
 * 입력 데이터 수 : 5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 최소값:60
 * 최대값:100
 */
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		System.out.println("입력 데이터 수 : "+cnt);
		
		int [] score = new int[cnt];
		for(int i=0; i<cnt; i++) {
			score[i] = sc.nextInt();
		}
		
		//한 번의 반복이 완료될 때마다 가장 큰 수는 배열의 가장 마지막 부분으로 밀리는 것이 보장됨
		for(int i=0; i<score.length; i++) {
			//따라서, 한 번의 반복마다 가장 뒤의 인덱스는 비교하지 않도록 반복문 설계
			for(int j=0; j<score.length-1-i; j++) {
				//만일, 앞의 수가 뒤의 수보다 더 크다면 위치 바꿔주기
				if(score[j]>score[j+1]) {	//얘 부등호 방향만 바꾸면 내림차순이 됨
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("출력");
		System.out.println("최소값:"+score[0]);
		System.out.println("최대값:"+score[cnt-1]);
		
/*
 * 		int min = score[0];
 * 		for(int i=1; i<score.length; i++) {
 * 			if(score[i]<min) min=arr[i];
 * 			if(score[i]>max) max=arr[i];
 * 		}
 * 		System.out.printIn("최소값:"+min)
 * 		System.out.printIn("최대값:"+max)	
 */
	}

}
