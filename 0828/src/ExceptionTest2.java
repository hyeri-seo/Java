
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {2,4,6,0, 10};
		int tot = 0;	//sum(arr1[i]/arr2[i])
		double count = arr1.length;
		
		for(int i=0; i<arr1.length; i++) {
			try {
				tot += arr1[i]/arr2[i];
			} catch(ArithmeticException e) {	//산수 예외처리. 0으로 나누는 것
				count--;
			} catch(ArrayIndexOutOfBoundsException e) {
				count--;
			} catch(Exception e) {}
			//맨 위에 catch(Exception e)하면 아래가 오류 나는 이유가 아래까지 갈 필요가 없어서
			//최상위 예외 Exception은 맨 마지막에 와야 함
			System.out.println(tot);
			System.out.println(tot/(double)count);
			System.out.println("프로그램 종료");
		}
	}
}

// try 안에 try가 또 들어갈 수 있음
// catch 안에 try-catch가 또 들어갈 수 있음
// catch가 하나라도 있어야 함. 없으면 try가 의미가 없음