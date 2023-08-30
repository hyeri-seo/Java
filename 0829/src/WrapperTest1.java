
public class WrapperTest1 {

	public static void main(String[] args) {
		int m = 10;
		Integer n = m;	//Boxing: int가 Integer로 바뀌는 거
		int r = n;		//Unboxing: Integer가 int로 가는 거
		long l = m;
		
		Object obj = 100;	//Boxing + Upcasting
	}

}
