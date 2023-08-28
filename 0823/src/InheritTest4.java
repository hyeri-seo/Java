class A {
//	A() {}
	A(int m) {}
}
class B extends A {
	B(int m) {
		super(m);	//숫자만 써줘도 오류가 안 남
	}
}
//기본 생성자 자동으로 들어가 있는 거임

public class InheritTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
