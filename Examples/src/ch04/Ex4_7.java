package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
		// Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
		//(1)에 알맞은 코드를 넣으시오.
		//0.0<=Math.random()<1.0
		//0.0*6<=Math.randaom()*6<6.0
		//1<=Math.random()*^+1<7
		
		int value = (int)(Math.random()*6)+1;
		System.out.println("value:"+value);
	}

}
