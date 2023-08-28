
public class ExceptionTest3 {

	public static void main(String[] args) throws Exception {
//		try {
			throw new Exception("예외 발생");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}

//throws 키워드는 메소드 선언부 끝에 작성됨. throw+예외 클래스
//메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 함
