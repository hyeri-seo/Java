
public class Ex6_24 {
	
//	메서드명 : abs
//	 기 능 : 주어진 값의 절대값을 반환한다.
//	 반환타입 : int 
//	 매개변수 : int value
	
	/*
	 * (1) abs메서드를 작성하시오.
	 */
	public static int abs(int value) {
		value = (value>=0)?value:-value;
		return value;	
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

}
// 5의 절대값:5
// -10의 절대값:10