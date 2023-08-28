class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~");
	}
}

public class PolinoTest4 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.water();
		
		Car car = fe;	//upcasting
//		car.water();	안 됨. 가능하게 하려면 다운캐스팅 해야 함
		if(car instanceof FireEngine) {
			FireEngine fe2 = (FireEngine)car;	//downcasting
			fe2.water();
		}
		
	}

}
