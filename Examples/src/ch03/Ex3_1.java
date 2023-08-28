package ch03;

public class Ex3_1 {

	public static void main(String[] args) {
		// 다음 연산의 결과를 적으시오.
		int x =2;
		int y =5;
		char c = 'A';; //'A'의 문자코드는 65
		
		System.out.println(1+x<<33);				//3를 2진수로 표현하면 101
		System.out.println(y>=5 || x<0 && x>2);		//&&가 ||보다 먼저 계산됨
		System.out.println(y+=10-x++);				//15-2 하고 x가 1증가
		System.out.println(x+=2);					//3+2
		System.out.println(!('A'<=c && c<= 'Z'));	//true를 뒤집으니까 false
		System.out.println('C'-c);					//67-65=2
		System.out.println('5'-'0');				//53-48=5
		System.out.println(c+1);					//66
		System.out.println(++c);					//B
		System.out.println(c++);					//B
		System.out.println(c);						//C
	}

}
