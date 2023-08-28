package Ex6;
class MyPoint2 {
	int x;
	int y;
//	double getDistance(int x1, int y1){
//		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	double getDistance(MyPoint2 pos) {
		return Math.sqrt((x-pos.x)*(x-pos.x)+(y-pos.y)*(y-pos.y));
		
	}
	
	
}

public class Ex6_7_응용 {

	public static void main(String[] args) {
		MyPoint2 pos1 = new MyPoint2();
		pos1.x=1;
		pos1.y=1;
		MyPoint2 pos2 = new MyPoint2();
		pos2.x=2;
		pos2.y=2;
		
		//System.out.println(pos1.getDistance(2,2));
		System.out.println(pos1.getDistance(pos2));

	}

}