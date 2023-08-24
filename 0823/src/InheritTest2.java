class Base {
	int bnum;
	void method1() {}	//1
	void method2() {}	//2
}
class Derived extends Base {
	int dnum;
	void method1(int n) {}	//5
	void method2() {//3이렇게 하면 맨 아래 d.method2()에서 3이 호출됨. 오버라이딩. 6이라고 하면
		method1();	//가능, 1
//		method2();	불가능. 잘못 사용 확률 매우 높음
		super.method2();//재귀함수
	} 		
	void method2(int n) {	//3
		method2();			//가능, 6
	}
	void method3() {}		//4
}

public class InheritTest2 {

	public static void main(String[] args) {
		Base b = new Base();
		b.bnum = 10;
		b.method1();	//1
		b.method2();	//2
		
		Derived d = new Derived();
		d.bnum = 20;
		d.dnum = 30;
		d.method1();	//1
		d.method2();	//2(오버로딩. 이름은 같은데 매개변수가 다름)/6
		d.method3();	//4
		
	}

}
