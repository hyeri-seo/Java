
public class ClassTest1 {		//하나의 main에 하나의 public class

	public static void main(String[] args) {
		int n;
		double d;		//8byte짜리 생성된 거얌

		int[] arr = new int[3];		//주소 생성해서 arr에 담은 거다
		//배열도 클래스 타입이다. 레퍼런스 타입이다.
		
		Student stu1 = new Student();//stu1은 객체를 담고 있는 레퍼런스 변수임, new Student()가 객체
		Student stu2;	//얘는 객체를 생성을 안 한 상태라 오류남
		//만약에 new 사용해서 객체 생성하고 출력하면 null null 0 0로 출력됨
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;
		
		System.out.println(String.format("이름:%s, 주소:%s, 학년:%d, 학번:%d",
				stu1.name, stu1.address, stu1.grade, stu1.num));
		
		System.out.println(stu1.info());
	}

}
