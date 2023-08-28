package Ex6;

//다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가

//홍길동,1,1,100,60,76,236(총합),78.7(평균)

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {	//변수는 get 없고 method는 get 붙임
		return kor+eng+math;
	}
	
	float getAverage() {
		return (kor+eng+math)/(float)3;
	}
	
	Student1 (String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	String info() {
//		int total = kor+eng+math;
//		float avg = total/(float)3;
		return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f",	//.1 소수점 첫번째 자리로 반올림
				name, ban, no, kor, eng, math, getTotal(), getAverage());
		//this가 없으면 그냥 제일 가까운 애 씀. this 있으면 클래스 내에 있는 거 쓰는 거임
	}
}

public class Ex6_3 {

	public static void main(String args[]) {
		Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
	}
}