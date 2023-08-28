package Ex6;
//문제6-6에서 작성한 클래스메서드 getDistance()를
//MyPoint1 클래스의 인스턴스메서드로 정의하시오.

class MyPoint1 {
	int x;
	int y;

	MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance1(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	
	/*
	 * (1) 인스턴스메서드 getDistance를 작성하시오.
	 */
}

class Ex6_7_연습 {
	public static void main(String args[]) {
		MyPoint1 p = new MyPoint1(1, 1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance1(2, 2));
	}
}

//1.4142135623730951
