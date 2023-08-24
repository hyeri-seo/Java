package Ex;

public class Circle extends Shape {
	double radius;
	
	Circle() {}
	
	Circle(double r) {
		this(new Point(0,0), r);	// Circle(Point p, double r)를 호
	}
	
	public Circle(Point p, double r) {
		super(p);	//조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		this.radius = r;
	}
	
	@Override
	double calcArea() {
		return Math.PI * radius * radius;
	}

}
