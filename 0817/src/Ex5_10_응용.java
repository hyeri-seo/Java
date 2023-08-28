
public class Ex5_10_응용 {

	public static void main(String[] args) {
		// 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		//(1)에 알맞은 코드를 넣어서 완성하시오.
		char[] abcCode = 
			 { '`','~','!','@','#','$','%','^','&','*',
			 '(',')','-','_','+','=','|','[',']','{',
			 '}',';',':',',','.','/'};
			 // 0 1 2 3 4 5 6 7 8 9 
		
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "!$&qup";	//암호화 된 것을 원래로 찾아내는 것
			String result = "";
			
			 // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
			// numCode[0] = q, numCode[1] = w, numCode[2] = e, ...
			// abcCode[a] = ', numCode[b] = ~, numCode[2] = !, ...
			
			for(int i=0; i < src.length();i++) {
				char ch = src.charAt(i);
				if(ch>='a' && ch<='z')	{
					for(int j=0; j<numCode.length; j++)	{
						if(ch == numCode[j])	{
							result += j;	
						}
					}
				} else {
					for(int j=0; j<abcCode.length; j++) {
						if(ch == abcCode[j])	{
							result+= (char)(j+'a');
						}
					}
				}
			}
			System.out.println("src:"+src);
			System.out.println("result:"+result);
	}

}
