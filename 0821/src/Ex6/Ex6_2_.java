package Ex6;	//이거 6-1, 6-2 예제 합친 것

class SutdaCard {
	int num;
	boolean isKwang;
	//여기 초기화 하는 거는 쓰잘데기 없음. 어차피 아래에서 num이랑 isKwang 매개변수 넣어줌
	public SutdaCard() {
		this(1, true);
//		this.num = 1; 
//		this.isKwang = true;
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;	//앞은 클래스 변수, 뒤에 있는 건 파라미터(매개변수)
//		앞에 num=1 넣으면 this.num이 뭐든 다 1이 되어버림
//		뒤에 넣으면 아무 쓰잘데기 없음. this.num이 안 바뀜
		this.isKwang = isKwang;
	}
	//객체를 생성할 때(new) 내부에서 사용하기 위해 가져오는 매개변수
	
	String info() {
		return num+(isKwang?"K":"");	//isKwang 애초에 boolean이니까 걍 넣어
	}
}

public class Ex6_2_ {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());	//광이 아닐 경우에는 info에서 아무것도 안 찍고 숫자만 찍음
		System.out.println(card2.info());

	}

}
//3		
//1K	기본값이 1, true

// 음료수 버튼을 안 누르면 암것도 안 나옴. return 필요함. method 안에서만
// 자판기에 돈을 넣는 거는 return이 없음 그래서 void