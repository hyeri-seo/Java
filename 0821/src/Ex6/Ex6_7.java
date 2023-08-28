package Ex6;
class MyPoint{
	int x;
	int y;
	double getDistance(int x1, int y1){
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		
	}
	
	
}

public class Ex6_7 {

	public static void main(String[] args) {
		MyPoint pos1 = new MyPoint();
		pos1.x=1;
		pos1.y=1;
		
		System.out.println(pos1.getDistance(2,2));

	}

}