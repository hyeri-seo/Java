
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] narr1 = new int[5];	//배열의 각 요소는 0으로 자동 초기화됨
		double[] darr1 = new double[5];
		//얘는 레퍼런스만 정해져 있음.
		//원래는 int 뭐 다른 거 크기가 다 다름
		//근데 배열은 다 같음. 배열명에 들어가는 크기는 다름
		//주소는 무적권 4byte
		//다섯 칸. 0 1 2 3 4 그게 또 각각 4바이트
		
		int[] narr2;
		narr2 = new int[10];
		
		narr1[0] = 1;
		narr1[1] = 2;
		narr1[2] = 3;
		narr1[3] = 4;
		narr1[4] = 5;
		//narr1[5] = 6;

		int sum = 0;
		for(int i=0; i<narr1.length; i++)	{
			sum += narr1[i];
		}
		System.out.println(sum);
	}

}
