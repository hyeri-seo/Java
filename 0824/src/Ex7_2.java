

//1. 메서드명 : shuffle
//	기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//	반환타입 : 없음
//	매개변수 : 없음

//2. 메서드명 : pick
//	기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//	반환타입 : SutdaCard
//	매개변수 : int index - 위치

//3. 메서드명 : pick
//	기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//	반환타입 : SutdaCard
//	매개변수 : 없음

class SutdaDeck1 {
	final int CARD_NUM = 20;
	SutdaCard1[] cards1 = new SutdaCard1[CARD_NUM];

	SutdaDeck1() {
		for (int i = 0; i < cards1.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards1[i] = new SutdaCard1(num, isKwang);
		}
	}
	/*
	 * (1) 위에 정의된 세 개의 메서드를 작성하시오.
	 */
	void shuffle() {
		for(int x=0; x<1000; x++) {
			int i = (int)(cards1.length*Math.random());
			int j = (int)(cards1.length*Math.random());
			SutdaCard1 temp = cards1[i];
			cards1[i] = cards1[j];
			cards1[j] = temp;
		}
		
	}
	
	SutdaCard1 pick(int index) {
		return cards1[index];
	}
	SutdaCard1 pick() {
		int index = (int)(Math.random()*cards1.length);
		return pick(index); // pick(int index)를 호출한다.
		}
	
} // SutdaDeck

class SutdaCard1 {
	int num;
	boolean isKwang;

	SutdaCard1() {
		this(1, true);
	}

	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Ex7_2 {
	public static void main(String args[]) {
		SutdaDeck1 deck = new SutdaDeck1();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards1.length; i++)
			System.out.print(deck.cards1[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}