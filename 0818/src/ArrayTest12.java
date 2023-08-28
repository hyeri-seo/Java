import java.util.Scanner;
public class ArrayTest12 {

	public static void main(String[] args) {
//학생 3명의 국어, 영어, 수학 점수를 입력받아 학생별 총점과 과목별 합계를 아래와 같이 출력하는 프로그램을 작성하시오.
//입력
//<1번째 학생의 점수>
//국어:95
//영어:100
//수학:88
//<2번째 학생의 점수>
//국어 85
//영어 60
//수학 93
//<3번째 학생의 점수>
//국어 66
//영어 99
//수학 88
//출력
//		국어	영어	수학	총점
//1번	95	100	88	283
//2번	85	60	93	238
//3번	66	99	88	253
//평균	82	86	89
		
		Scanner sc = new Scanner(System.in);
		String[] subject = {"국어", "영어", "수학"};
		int [][] scores = new int[4][4];
		for(int i=0; i<scores.length-1; i++) {
			System.out.println("<"+(i+1)+"번째 학생의 점수 입력>");
			for(int j=0; j<scores[i].length-1; j++) {
				System.out.print(subject[j]+":");
				scores[i][j] = sc.nextInt();
				scores[i][scores[i].length-1] += scores[i][j];
				scores[scores.length-1][j] += scores[i][j];
			}
		}
		
		for(int i=0; i<scores[0].length; i++) {
			scores[scores.length-1][i] /= 3;
		}
		
		System.out.println("\t국어\t영어\t수학\t총점");
		for(int i=0; i<scores.length; i++) {
			if(i<scores.length-1) {				//0~3번째까지여야 하니까 등호 없어야 함
				System.out.print((i+1)+"번\t");
			} else {
				System.out.print("평균\t");
			}
			for(int j=0; j<scores[i].length; j++) {
				if(scores[i][j]!=0) {
					System.out.print(scores[i][j]);
				} 
				System.out.print("\t");
			}
			System.out.println();
		}
//		System.out.print(String.format("%d번\t%d\t%d\t%d\t%d", i, kor[i], eng[i], math[i], total[i]));
	}

}
