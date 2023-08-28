

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	SutdaDeck() {
		/*
		 * 배열 SutdaCard를 적절히 초기화 하시오.
		 */
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = i<10 && (num == 1||num == 3||num==8);
			
			cards[i] = new SutdaCard2(num, isKwang);
		}
	
//		강사님 설명
//		int length = CARD_NUM/2;
//		for(int i=0; i<length; i++) {
//			if((i+1)==1||(i+1)==3||(i+1)==8) {
//				cards[i] = new SutdaCard(i+1, true);
//			} else {
//				cards[i] = new SutdaCard(i+1, false);
//			}
//			cards[10+i] = new SutdaCard(i+1, false);
//		}
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
	
	//info() 대신 Objcet클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

class Ex7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}

	}

}

// 실행결과
// 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,