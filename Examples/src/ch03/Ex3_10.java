package ch03;

public class Ex3_10 {

	public static void main(String[] args) {
//		다음은 소문자를 대문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다.
//		예를 들어 'A'의 코드는 65이고 'a'의 코드는 97이다. 
		char ch = 'A';
		
		char lowerCase = (ch-0>=97) ? (char)(ch-32) : (char)(ch+32);
		
		System.out.println("upperCase:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}

}

//97-65=32
//소문자를 대문자로 변경하려면 32만큼 빼줘야 함
//대문자를 소문자로 변경하려면 32만큼 더해줘야 함
