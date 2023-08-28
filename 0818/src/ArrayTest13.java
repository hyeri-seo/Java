
public class ArrayTest13 {

	public static void main(String[] args) {
		// 1. 배열 생성 int 5x6
		int[][] num = new int[5][6];
		
		// 2. 첫 행을 1로 초기화
		for(int i=0; i<num[0].length; i++) {
			num[0][i] = 1;
		}
		for(int i=1; i<num.length; i++) {
			num[i][0] = 0;
		}
		for(int i=1; i<num.length; i++) {
			for(int j=1; j<num[0].length; j++) {
				num[i][j] = num[i-1][j]+num[i][j-1];
			}
		}
		for(int i=0; i<num.length; i++) {
			for(int j=1; j<num[0].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

//1	1	1	1	1	1
//0	1	2	3	4	5
//0	1	3	6	10	15
//0	1	4	10	20	35
//0	1	5	15	35	70

//i행 j열 = (i-1)행 j열+i행 (j-1)열