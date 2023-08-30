package ex;

//다음과 같은 실행결과를 얻도록 SutdaCard클래스의 equals()를 멤버변수인 num,
//isKwang의 값을 비교하도록 오버라이딩하고 테스트 하시오.

public class Ex9_1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		/*
		 * (1) 매개변수로 넘겨진 객체의 num, isKwang과 멤버변수 num, isKwang을 비교하도록 오버라이딩 하시오.
		 */
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num == c.num && isKwang == c.isKwang;
		}
		return false;
		
//		강사님 풀이
//		if(obj==null || !(obj instanceof SutdaCard)) return false;
//		SutdaCard sc = (SutdaCard)obj;
//		return num == sc.num && isKwang == sc.isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
//
//c1=3K
//c2=3K
//c1.equals(c2):true

//매개변수가 Object타입이므로 어떤 타입의 인스턴스도 매개변수로 가능하다.
//그래서 반드시 instanceof로 확인한 후에 형변환해서
//멤버변수 num과 isKwang의 값을 비교해야한다.
//만일 instanceof의 결과가 false라면 멤버변수의 값을 비교할 필요도 없이 
//그냥 false만 반환하면 된다.
