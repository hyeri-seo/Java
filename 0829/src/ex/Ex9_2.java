package ex;

public class Ex9_2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));		//비교하고자 하는 두 개의 주소값 비교
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));	//대상의 값 자체를 비교
	}
}

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	public boolean equals(Object obj) {	//Object - java의 최상위 부모 클래스
		/*
		 * (1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.
		 */
		if(obj instanceof Point3D) {	//instanceof 연산자는 객체가 특정 클래스에 속하는지 아닌지 확인
			Point3D p = (Point3D)obj;	//다운캐스팅
			return x == p.x && y == p.y && z == p.z;
		}
		return false;
	}

	public String toString() {
		/*
		 * (2) 인스턴스변수 x, y, z의 내용을 출력하도록 오버라이딩하시오.
		 */
		return "["+x+","+y+","+z+"]";
	}
}

//[1,2,3]
//[1,2,3]
//p1==p2?false
//p1.equals(p2)?true
