
public class Ex5_12 {

	public static void main(String[] args) {
		// 3m자리 우물의 바닥에 달팽이가 있다.
		// 달팽이는 낮동안 55cm 올라올 수 있다. 하지만 날이 지면 잠을 자야 한다.
		// 자는 동안 3cm를 미끄러져 내려온다.
		// 달팽이가 우물 밖으로 나오는데 며칠이 걸릴까?
//		int[]height = new int[6];
//		int day;
//		for(int i=0; i<height.length; i++) {
//			day = i+1;
//			height[i] += 55+52*(day-1);
//			if(height[i]>=300)	{
//				System.out.println(day);
//				break;
//			}
//		}
		
		int depth = 3*100, height = 0;
		final int up = 55;
		final int down = 3;
		int days = 1;
		
		while(true) {
			height+=up;
			if(height>=depth) break; 		//무한루프는 break가 있어야 함
			days++;
			height-=down;
		}
		System.out.println(days);		
	}

}
