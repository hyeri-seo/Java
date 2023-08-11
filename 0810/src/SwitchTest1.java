import java.util.Scanner;	//import는 다른 패키지의 클래스 사용하고 싶을 때 사용함 ctrl+shift+o
//import 패키지명.클래스명; or import 패키지명

public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수:");
		int kor = sc.nextInt();
		System.out.println("영어점수:");
		int eng = sc.nextInt();
		System.out.println("수학점수:");
		int math = sc.nextInt();
		
		int tot = kor+eng+math;
		double avg = tot/(double)3;

		String grade = "";	//이건 빈 문자열에 주소가 들어간 것
		//class(대문자로 시작하는 애들)의 초기화는 null을 이용해도 됨. 주소가 0이라는 뜻
		
		switch((int)avg/10) {
		case 10: grade="A"; break; 
		case 9: grade="B"; break; 
		case 8: grade="C"; break; 
		case 7: grade="D"; break; 
		default: grade="F";
		}
		System.out.println(grade);
		
		char ch=' '; //char는 뭔가 들어가야 함 스페이스바라도.
	}

}
