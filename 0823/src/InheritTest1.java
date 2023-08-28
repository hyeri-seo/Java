class Person {
	int age;
	String name;
	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String info() {
		return "이름:"+age+", 나이"+age;
	}
}

class Student extends Person {
	String major;
	int grade;
	
	Student () {}
	
	Student (String name, int age, String job, int grade) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
	//부모의 생성자가 있어야 오류가 안 남
	
	@Override	//부모의 메서드를 재정의 한다. 상속이 전제 조건임. 오버로딩이랑 헷갈리지 말기
	String info() {
		return super.info()+", 전공:"+major+", 학년:"+grade;
		//super는 this랑 비슷한 느낌인데 내 거가 아니라 부모 거 호출할 때 쓰는 거
	}
}
//부모의 뭐가 없어서 자식이 에러남?

public class InheritTest1 {

	public static void main(String[] args) {
		Student stud1 = new Student();	//자식 객체를 통해 부모 클래스의 속성과 메서드를 사용할 수 있다.
		stud1.name = "열심히";
		stud1.age = 20;
		stud1.major = "산업공학";
		stud1.grade = 2;
		System.out.println(stud1.info());
		
		Student stud2 = new Student("돈많은",40,"금융",3);
		
		Person per1 = new Person();
		per1.name = "내로남불";
		per1.age = 30;
//		자식은 부모를 아는데 부모는 자식을 모름
//		부모 객체는 자식의 속성과 메서드를 사용할 수 없다.
//		per1.major = "얌채과";
//		per1.grade = 3;
		System.out.println(per1.info());
	}

}
