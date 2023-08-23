class Person {
	int age;
	String name;
//	Person() {
	
//	생성자는 클래스명이랑 똑같이 생겨씀. 이게 기본 생성자
//	void도 붙이면 안 됨. 클래스명이랑 똑같아야 하니까 대문자로 시작
//	return 타입을 생략함. return을 줄 수가 없음
//	return은 new가 함. 생성자는 return 타입을 아예 생략함. 기본 생성자
	
////		얘 앞에 private 붙이면 에러남. 밖에서 호출이 불가능하다
////		이렇게 했더니 new에 오류남. 기본 생성자가 있음을 알려주는 고임
////		아예 없으면 에러가 안 남. 에러 났다는 거는 안 보여도 있다는 걸 의미함
////		생성자는 메소드고 메소드는 오버로딩이 가능함
////		System.out.println("Person()");
//	}
	
//	Person(String n, int a) {
//		age = a;
//		name = n;
//	}
//	얘 만들어주면 아래가 또 안 됨
//	생성자가 아예 없으면 기본 생성자가 만들어짐
//	생성자를 하나라도 만들면 기본 생성자가 안 만들어짐
//	기본 생성자 짱 중요. bean 객체는 new가 아니라 자동으로 생성됨 
//	그러니까 기본 생성자 손코딩 해주면 조탕
	
	Person() {
		this("none", 0);	//괄호 있으니까 method.
//		생성자에서 다른 생성자 호출, 반드시 생성자 맨 처음에 호출해야 함
		age = 0;
		name = "none";
	}
	Person(String n, int a) {
		age = a;
		name = n;
	}
	Person(String n) {
		this(n, 0);
		System.out.println(n);
//		name = n;
//		age = 0;
	}
	Person(int a) {
		this("none", a);
//		age = a;
//		name = "none";
	}
	Person(Person p) {
		name = p.name;
		age = p.age;
	}
	
	String info(Person this) {
		return "이름:"+this.name+",나이:"+this.age;
	}
}
public class ConstructorTest1 {

	public static void main(String[] args) {
		Person per1 = new Person("홍길동", 20);
		Person per2 = new Person();
		per2.name = "고길동";
		per2.age = 30;
		per2.info();	// Person.info(per2)
		Person per3 = new Person("차길동");
		Person per4 = new Person(40);
		Person per5 = new Person(per1);

	}

}
