class MyClass {
	Point p;
	MyClass() {
		p = new Point(10, 10);
	}
}

class YourClass extends MyClass {
	int x;
}
// 부모 생성자를 호출함. 

public class PointTest1 {
	
	public static void main(String[] args) {
		YourClass c = new YourClass();
		System.out.println(c.p.y);
	}

}
