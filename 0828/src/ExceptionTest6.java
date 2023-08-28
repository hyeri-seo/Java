import java.io.IOError;
import java.io.IOException;

public class ExceptionTest6 {

	static void method1() throws IOException, Exception {	//throws는 나를 호출한 메소드한테 두 예외처리를 위임을 한다는 거임
		boolean flag = true;
		if(flag) {
			throw new IOException("입출력 예외");
		} else {
			throw new Exception("모든 예외");
		}
	}
	
	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
