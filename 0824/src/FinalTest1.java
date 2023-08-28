class TempClass {
	final int x;	//이렇게만! 하면 초기화 안 해서 오류남. 원래 변수의 초기화는 생성자에서 많이 함
//	final int x=10; 명시적 초기화를 하면 모든 변수값을 10임. 변경할 수 없음. 그래서 얘는 인스턴트가 아니라 static이어야 함
//	static이 아닌 final은 각자의 값을 가지게 됨. 시리얼 넘버처럼 다 달라야 하기 때문에 초기화를 생성자에서 해줘야 함
	//final 이지만 static은 아님
//	static final int sx = 100;	//얘는 명시적 초기화를 많이 함. 모든 객체들이 변경 안 하고 하나의 값이어야 하기 때문에
//	원래 final 변수의 원래 용도는 객체들이 각각 다른 값으로 초기화 시켜서 쓸 때 쓰는 거.
//	고정 값은 명시적 초기화 써서 static이랑 final이랑 같이 써야 함
	
	TempClass(int x) {
		this.x = x;		//instance final은 생성자에서 초기화 한다.
		//sx=x;			static final은 생성자에서 초기화 할 수 없다.
	}
	
	void method(int x) {
//		this.x = x; 이렇게 하면 오류. 파이널 변수이기 때문에
	}
}
public class FinalTest1 {

	public static void main(String[] args) {
		final int n;
		n=10;	//처음 것만 초기화로 인식함
//		n=20;	얘는 초기화가 안 됨. n 앞에 final이 붙어서
		System.out.println(n);
		
		new TempClass(20);
		new TempClass(30);

	}

}
