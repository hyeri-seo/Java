class MyMath {
	static int add(int x, int y) {
		int result = x+y;
		return result;
		
	}
	static int multi(int x, int y) {
		int result = x*y;
		return result;
	}
}
// void는 return을 하지 않아도 됨
// int, double 이런 타입은 무.적.권 return 필요함
// static은 메소드에도 붙ㅇ리 수 있음


public class MethodTest1 {

	public static void main(String[] args) {
//		MyMath mm = new MyMath(); 얘는 선언 안 해도 됨.
//		static이 붙으면 난 객체 소속이 아니야 클래스 소속이얌
//		new 했을 때 생성되는 것은 변수지 함수가 아님
		
		int result = MyMath.add(10, 20);	//mm 객체에 add 함수 return 값을 res에 넣을 거다.
		System.out.println(result);
		result = MyMath.multi(100, 200);
		System.out.println(result);

	}

}

//void는 return을 안 썼을 때 중괄호를 만나면 자동 return이 난다는 것 = 함수가 끝났다.
//return 안 씀.

