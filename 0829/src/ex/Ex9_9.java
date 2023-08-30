package ex;

//메서드명 : delChar

//기 능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
//반환타입 : String
//매개변수 : String src - 변환할 문자열
//		   String delCh - 제거할 문자들로 구성된 문자열
//[힌트] StringBuffer와 String클래스의 charAt(int i)과
//		indexOf(int ch)를 사용하라.
// deleteCharAt(int i)

public class Ex9_9 {
	/*
	 * (1) delChar메서드를 작성하시오.
	 */

	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);
//		for (int i = 0; i < src.length(); i++) {
//			char ch = src.charAt(i);
//			if (delCh.indexOf(ch) == -1) {
//				sb.append(ch);
//			}
//		}
//		sb.append(src);	//A.append(B) A에 B를 집어넣어
		int i = 0;
		while(i<sb.length()) {
			char ch = sb.charAt(i);
			if(delCh.indexOf(ch)>=0) {	//A.indexOf(B)는 A에서 B가 있는 인덱스 뽑아냄
				sb.deleteCharAt(i);
			} else {
				i++;	//else에 i++한 이유는 while 안에서 i++하면 안에 있는 값이 앞으로 계속 밀려서.
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}

//(1!2@3^4~5) -> 12345
//(1 2 3 4 5) -> (12345)
