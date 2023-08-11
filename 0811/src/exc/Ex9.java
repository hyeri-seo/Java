package exc;

public class Ex9 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 str이 있을 때
		//각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		//만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다.
		//(1)에 알맞은 코드를 넣으시오.
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++)	{ //length는 문자열의 길이
			char ch = str.charAt(i);	//'1' : 49, '2': 50
			sum += ch-'0';	//숫자 캐릭터를 숫자로 바꾸는 방법.
		}
		System.out.println("sum="+sum);
	}

}

//ram은 메모리를 주고 받을 때 주소를 쓴다
//작은 따옴표는 2바이트지만 큰 따옴표는 4바이트. 왜냐하면 null로 끝나기 때문