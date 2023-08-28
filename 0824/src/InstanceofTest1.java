
public class InstanceofTest1 {

	public static void main(String[] args) {
		Base b1 = new Base();
		Base b2 = new Base();

		if(b1 instanceof Base) {
			System.out.println("b1 is Base instance");
		}	//얘랑
		
		if(b1 instanceof Derived) {
			System.out.println("b1 is Derived instance");
		}
		
		if(b2 instanceof Base) {
			System.out.println("b2 is Base instance");
		}	//얘만 출력됨
		
		if(b2 instanceof Derived) {
			System.out.println("b2 is Derived instance");
		}
	}

}
