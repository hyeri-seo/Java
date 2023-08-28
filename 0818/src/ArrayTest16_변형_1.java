import java.util.Scanner;

public class ArrayTest16_변형_1 {

	public static void main(String[] args) {
/* 아래와 같은 파스칼 삼각형을 출력하는 프로그램을 작성하시오.
 * 1
 * 01
 * 001
 * 0001
 * 00001
 * 000001
 * 0000001
 */

		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기: ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				if(j==i) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] =0;
				}
			}
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
