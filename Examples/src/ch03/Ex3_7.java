package ch03;

public class Ex3_7 {

	public static void main(String[] args) {
		// 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		//변환공식이 'C = 5/9 × (F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오.
		//단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
		int fahrenheit = 100;
		float celcius = (((float)5/9*(fahrenheit-32)*1000)%10)>=5
						?((int)((float)5/9*(fahrenheit-32)*100)+1)/(float)100
						:(int)((float)5/9*(fahrenheit-32)*100)/(float)100;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
