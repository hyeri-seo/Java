package ex;

//메서드명 : delChar

//기 능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
//반환타입 : String
//매개변수 : String src - 변환할 문자열
//		   String delCh - 제거할 문자들로 구성된 문자열
//[힌트] StringBuffer와 String클래스의 charAt(int i)과
//		indexOf(int ch)를 사용하라.
// deleteCharAt(int i)

public class Ex9_9_강사님 {
	/*
	 * (1) delChar메서드를 작성하시오.
	 */

	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);
		for(int i=0; i<delCh.length(); i++) {
			int idx = 0;
			while(true) {
				idx = sb.indexOf(delCh.charAt(i)+"", idx);
				if(idx<0) break;
				sb.deleteCharAt(idx);
				idx++;
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
