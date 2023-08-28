
public abstract class Shape {
	String color;
	
	public Shape() {}
		
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Shape(String color) {
		this.color = color;
	}
	
//	public String info() {
//		return "색("+color+")";
//	}
	public abstract String info();
}
