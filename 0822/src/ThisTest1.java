class Account1 {
	String id;
	String name;
	int balance;
	
	Account1(String id, String name, int balance) {
		this.id=id;	
//		this: 명확히 인스턴스 변수라는 것을 구별할 때 씀. 스태틱에서 쓸 수 없음
//		좌: 인스턴스변수, 우: 생성자의 매개변수로 정의된 지역변수
		this.name=name;
		this.balance=balance;
	}
	
	String info() {
		return "계좌번호:"+this.id+",이름:"+this.name+",잔액:"+this.balance;
	}	//얘는 this 안 써줘도 됨.ㅣ
}
public class ThisTest1 {

	public static void main(String[] args) {
		Account1 acc1 = new Account1("10001","홍길동",100000);
//		new Account()

	}

}
