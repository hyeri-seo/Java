package ch03;

public class Ex3_8 {

	public static void main(String[] args) {
//		아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
//		c=30
//		ch=C
//		f=1.5
//		l = 27000000000
//		result=true
		
		byte a = 10;
		byte b = 20;
		int c = a + b;			//byte, short, char는 int로 변환하여 계산
		
		char ch = 'A';
		ch = (char)(ch+2);
		
		float f = (float)3 / 2;
		long l = (long)3000 * 3000 * 3000;		//long으로 강제타입변환 안 해주면 오버플로우
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;			//float이 더 작은 범위니까 오차 발생 가능. double로 변환
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}

}
