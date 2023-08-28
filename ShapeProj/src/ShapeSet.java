
public class ShapeSet {
	ShapeSet() {
	}

	Shape[] shapes = new Shape[100];
	int count=0;

	public void add(Shape s) {
		shapes[count++] = s;
	}

	public void allShapeDraw() {
		for(int i=0; i<count; i++) {
			System.out.println(shapes[i].info());
		}
	}
}
