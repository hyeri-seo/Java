class AA {
	int a;
	void methodA() {}	//1
	void method() {}	//2
	void info() {
		System.out.println(getPay());
	}
	int getPay() {
		return 0;
	}
}

class BB extends AA {
	int b;
	void methodB() {}	//2
	void method() {}	//4
	@Override
	int getPay() {
		return 100;
	}
	
}
public class PolinoTest2 {

	public static void main(String[] args) {
		AA obj = new BB();
		obj.methodA();	//1
//		obj.methodB();	//얘는 부모 타입에 없는 자식 메소드이기 때문에 호출 불가
		obj.method();	//4. 오버라이딩 한 경우는 자식 거를 가져옴
		obj.a = 10;
		obj.info();		//얘도 부모 타입에 없는 자식에만 있는 변수이기 때문에 호출 불가.
	}
// 자식객체를 부모 변수에 넣을 경우(AA obj = new BB();), 부모에는 없는 자식의 변수나 함수는 사용할 수 없음
// 단, 오버라이딩 한 함수는 부모 변수로 자식의 함수를 호출함
}
