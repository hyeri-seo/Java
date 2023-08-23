class Number {
	int inum;
	static int snum;
	
	void imethod() {
		inum = 10;
		snum++;		//instance 메소드에서는 static 변수 사용 가능
		imethod2();
		smethod();	//instance 메소드에서는 static 메소드 호출 가능
	}
	void imethod2() {
		
	}
	static void smethod() {
		snum = 100;
//		inum = 10; static mehod에서는 instance 변수 사용 불가
		smethod2();
//		imethod();	//static 메소드에서는 instance 메소드 호출 불가.
					//간접적인 변수 접근을 허용하지 않겠다는 것
	}
//	얘도 객체 생성 없이 클래스명만으로도 호출이 가능함
	static void smethod2() {
		
	}
}
public class StaticTest1 {

	public static void main(String[] args) {
		System.out.println(Number.snum);
		Number.smethod();
//			static(class) 변수는 객체 생성없이 사용 가능(프로그램 시시 이미 변수가 생성)
//		System.out.println(Number.inum);
//			instance 변수는 객체 생성해야만 사용 가능
//		Number.imethod(); instance 메소드는 객체 생성해야만 호출 가능
		
//		Number라는 클래스의 snum은 프로그램 시작 시 생성
//		하지만 inum은 생성이 안 되어 있어서 오류가 나는 거임

		Number n = new Number();
		System.out.println(n.inum);
		System.out.println(n.snum);	//static 변수는 레퍼런스를 통해서도 접근 가능
		n.imethod();
		n.smethod();
	}

}
// per 객체를 만들고 나서 per.age 해야댕
// main이 스태틱이 아니다면 메인 밖에서 객체 생성하고 해야 함
// 내부적으로 걔를 싸고 있는 클래스를 만든 다음 호출해야 했을 것임
// 대표적인 static method가 main임
// 인스턴트 메소드에서는 인스턴스 변수, 스태틱 변수(이미 만들어져 있어서) 다 사용가능
// 스태틱 메소드에서는 인스턴스 변수 사용 못함