class Parent {
//	Parent() {
//		System.out.println("Parent()");
//	}
	Parent(int n) {
		System.out.println("Parent(int n)");
	}
}
class Child extends Parent {
	int m;
	Child() {
		super(0);	//부모의 기본 생성자를 호출할 때 쓰는 게 아니라(얘는 기본 호출), 다른 생성자 호출해주고 싶을 때 사용
		System.out.println("Child()");
	}
	Child(int n, int m) {
		super(n);		//부모 생성자를 호출시켜주고 그 다음에 코드 짜기. 17번째 줄이랑 바뀌면 오류남
		this.m = m;
	}
}
// 부모 생성자도, 자식 생성자도 호출이 되는데 부모 것이 더 빨리 됨

public class InheritTest3 {

	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child();

	}

}
