class TClass1 {
	void method1() {
		int num1;
		method2();		//같은 클래스 내의 메소드들끼리 서로 호출이 가능하다. (레퍼런스 변수 없이)
	}
	void method2() {
		int num2;
		method3();
	}
	void method3() {
		int num3;
	}
}

class TClass2 {
	void title() {
		System.out.println("-----");
		System.out.println("제목");
		boolean flag = false;
		if(flag == true)
			return;
	}
}
// 같은 클래스 내에 있는 메소드들은 서로 호출이 가능함. 레퍼런스 변수 없이도.
// 일반 클래스 밖에서 변수나 메소드를 호출하려면 그 클래스를 생성했어야 함
// 하지만 클래스 내에서는 서로서로 호출하고 갖다 쓸 수 있음

public class ClassTest4 {

	public static void main(String[] args) {
		TClass1 tc = new TClass1();
		tc.method1();

	}

}
// 계좌에서의 입금은 내가 갖고 있는 돈에 추가해주는 것. 이미 찾아진 계좌에다가 돈을 넣어주는 것임
// 은행에서의 입금은 은행직원이 입금을 처리하는 것. 은행원이 입금을 할 때는 고객으로부터 통장과 돈을 받아서 계좌목록에서 찾음.
// 찾은 계좌에 돈을 넣음.
// 메소드들은 공통 코드를 갖다가 재사용함. 결국은 큰 범위 내에서는 클래스는 공통코드를 메소드로 묶어서 활용하기 위한 것임
// 은행이라는 기능에 공통으로 사용할 변수들이 있당~