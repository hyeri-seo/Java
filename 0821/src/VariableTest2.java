class MyNumber {
	int num;	//클래스 내 변수는 클래스 내 메소드들이 공유함
	void func1(int n) {
		int number = n;
		num = number;
	}
	void func2(int n) {
		int number = n;
		num = number;
	}
}
// func1과 func2의 n은 완전히 다름. 근데 num은 같은 변수임. 같이 공유하고 있음.
class MyMath2 {
	int x, y;
	int add() {
		return x+y;
	}
	int multi() {
		return x*y;
	}
}


public class VariableTest2 {

	public static void main(String[] args) {
		MyNumber mn = new MyNumber();
		System.out.println(mn.num);	//초기화를 안 했으니까 0으로 자동 초기화
		mn.func1(10);
		System.out.println(mn.num);	//얘는 10이 됨.
		mn.func2(20);
		System.out.println(mn.num);	//얘는 20이 됨.

		MyMath2 mm = new MyMath2();
		mm.x=10;
		mm.y=20;
		System.out.println(mm.add());
		mm.x=100;
		mm.y=202;
		System.out.println(mm.multi());
	}

}
