abstract class Player {
	int currentPos;
	public void Player() {
		currentPos=0;
	}
	abstract void play(int pos);
	abstract void stop();
	void play() {
		play(currentPos);	//sales에 getPay를 호출한 것과 동일함. 부모 클래스에 자식 메소드를 호출시킨 것
	}
}
//abstract class를 상속받으면 abstract method를 구현(오버라이드)하지 않으면, 상속받은 자식 클래스도 abstract 클래스여야 함
class DPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("DPlayer play(int pos)");
	}

	@Override
	void stop() {
		System.out.println("DPlayer stop()");
	}
	
}

public class AbstractTest1 {

	public static void main(String[] args) {
//		Player player = new PLayer(); //abstract class는 객체 생성 불가능. 메소드 호출 불가능
		DPlayer dPlayer = new DPlayer();
		dPlayer.play();
		dPlayer.stop();
		
		Player Player = new DPlayer();	//upcasting
		Player.play();
		Player.stop();
	}

}

