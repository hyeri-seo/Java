import java.util.Scanner;

public class ArrayTest16_파스칼의_삼각형 {

	public static void main(String[] args) {
		/*
		 * 행렬 크기: 7
		 * 1
		 * 11
		 * 121
		 * 1331
		 * 14641
		 * .
		 * .
		 * .
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기: ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		
		for(int i=0; i<size; i++) {
			matrix[i][i]=1;
		}
		for(int i=1; i<size; i++) {
			for(int j=0; j<i; j++) {
				matrix[i][j] = matrix[i-1][j];
				if(j>0) matrix[i][j] +=matrix[i-1][j-1];
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(String.format("%4d", matrix[i][j]));
			}
			System.out.println();
		}
	}

}
