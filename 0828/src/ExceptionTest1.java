
public class ExceptionTest1 {

	public static void main(String[] args) {
		String str = "hong";
		int[] arr = new int[5];
		try {
			System.out.println(str.toString());
			for(int i=0; i<=arr.length; i++) {
				arr[i] = i*10;
			}
		} catch(NullPointerException e) {		//Null~ 얘도 하나의 클래스임
//			e.printStackTrace();	//예외가 어디서 나왔고 무슨 예외인지 알고 싶을 때 쓰는 거
			System.out.println(e.getMessage());	//짧게 어떤 에러인지 나오는 거
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
	}

}
