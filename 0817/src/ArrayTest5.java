
public class ArrayTest5 {

	public static void main(String[] args) {
		int[][] narr2 = new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};	//index 지정할 때 중괄호에 숫자 넣는 것 허용하지 않음
		
		int[][] narr3 = new int[3][];
//		int[][] narr3;
//		narr3 = new int[3][4];
		narr3[0] = new int[] {1,2,3,4};
		narr3[1] = new int[] {5,6,7,8};
		narr3[2] = new int[] {9,10,11,12};
//		이차원 배열: 각 행에 따라 열을 동일하게 잡는 것

		int[][] narr4 = new int[3][];
		narr4[0] = new int[] {1,2,3,4,5};
		narr4[1] = new int[] {10,20};
		narr4[2] = new int[] {100,200,300};
//		가변 배열: 각 행에 따라 열을 다르게 잡는 것	

	}

}
