
public class ArrayTest7 {

	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};

		int[][] result = new int[narr.length+1][narr[0].length+1];
		int i, j;
		for(i=0; i<narr.length; i++) {							//행의 개수만큼 반복
			for(j=0; j<narr[i].length; j++) {					//열의 개수만큼 반복
				result[i][j] = narr[i][j];
				result[i][result[i].length-1] += result[i][j];	//마지막 열에 누적
				result[result.length-1][j] += result[i][j];		//마지막 행에 누적
				result[result.length-1][result[i].length-1] +=result[i][j];	//마지막 행렬에 누적
			}
		}
		for(i=0; i<result.length; i++) {
			for(j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println(result);
	}

}
// 10 20 30 40 160
// 50 60 70 80 260
// 90 100 110 120 420