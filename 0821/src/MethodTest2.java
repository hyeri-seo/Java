class Data {
	int x;
}

public class MethodTest2 {
	static void increment(int x) {
		x += 1;
		System.out.println(x);	//11
	}
	static void increment2(Data d) {
		d.x += 1;
		System.out.println(d.x);//11
	}
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		increment(data.x);			//data.x는 int타입임
		System.out.println(data.x);	//10
		
		increment2(data);
		System.out.println(data.x);	//11
	}

}
// main과 increment는 같은 클래스 내에 있으니까 서로 호출할 수 있음
// 위에 있는 int x와 data.x는 다른 변수임. 분리되어 있는 메모리임.
