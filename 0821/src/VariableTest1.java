class MyClass {
	int num;
	static int snum;
	
	void setNum(int n) {
		
	}
}
public class VariableTest1 {

	public static void main(String[] args) {
		int n;	//초기화되지 않음. 메소드 안에서 선언된 변수를 지역 변수라고 함.
		MyClass mc = new MyClass();
		//이때 num이라는 변수 생성됨. new에 의하면 자동 초기화
		//mc라는 변수는 n이랑 같은 영역인. 지역 변수임
		//얘가 생성되는 메모리 영역을 스택이라고 함.
		//정적은 처음부터 정해져 있고 동적은 필요할 때 정해지는 거
		//new라는 변수는 heap(동적으로 메모리 생성)에 생성됨
		
		//garbage collector 대상이 되는 메모리가 heap임

//		System.out.println(n);		//초기화 하지 않고 사용시 에러
		System.out.println(mc.num);	//초기화 하지 않고 사용 가능
	}

}
//모든 객체는 new 해야만 하니까 heap 영역에 생성됨
//지역 변수는 모두 스택에 생성됨. 호출되는 시점에만 살아있고 return되면 사라짐
//괄호 안에 생성된 변수는 지역 변수와 같음. 초기화와 동시에 됨. 스택 영역