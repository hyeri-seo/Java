package item;

public class Unit {
	int healthPoint;		//scv는 리페어 해줄 거임
	final int MAX_HP;	//생성되자마자 max
	Unit(int hp) {
		MAX_HP = hp;
		healthPoint=MAX_HP;
	}
}
