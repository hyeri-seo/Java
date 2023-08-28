class Person {
	String name;
	int age;
	
//class는 객체와 method의 집합이다	
//그리고 묶여 있는 변수를 공유한다
	
	String info() {		//method 정의
		return "이름:"+name+"나이:"+age;
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "홍길동";
		per1.age = 30;
		System.out.println(per1.info());	//info mehod 호출
		
		Person[] parr = new Person[5];
		//객체를 5개 만든 게 아니야. 배열 5개임. 레퍼런스 5개 선언한 거임
		
//		Person per*5
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();

		//안에 데이터가 몇 개가 있든 모든 레퍼런스는 4byte임. new 할 때 객체의 크기가 달라짐.
//		기본 데이터 타입의 배열 VS 객체 배열
//		기본 데이터 타입의 배열 : 배열 선언과 동시에 메모리 생성
//		객체 배열 : 객체 변수의 이름들만 생성, 실제 객체 내부의 메모리는 생성X
//		ex. Car[] car = new Car[8]; => 참조변수 8개 생성되지만
//		실제 8개의 참조변수에 대한 객체 자체의 메모리 생성 X
//		 ∴ 객체의 메모리를 따로 생성하는 과정이 별도로 필요함!
	}

}
