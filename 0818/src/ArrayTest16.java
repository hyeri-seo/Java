import java.util.Scanner;

public class ArrayTest16 {

	public static void main(String[] args) {
		/*
		 * 행렬 크기: 7
		 * 1
		 * 11
		 * 101
		 * 1001
		 * 10001
		 * 100001
		 * 1000001
		 * 
		 * 출력
		 * 최소값:60
		 * 최대값:100
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기: ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(j==i) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] =0;
				}
			}
			matrix[i][0]=1;
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
