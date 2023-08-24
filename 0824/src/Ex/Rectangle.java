package Ex;

public class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle() {}
	
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);	//조상의 멤버는 조상의 생성자가 초기화하도록 함
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare () {
		return width*height!=0 && width==height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}

}
