package Ex6;
class Account {
	String id;		//계좌번호
	String name;	//이름
	int balance;	//잔액
	String info() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id,name,balance);
	}
	void deposit(int money) {	//입금
		balance += money;
	}
	void withdraw(int money) {	//출금
		if(balance>=money) {
			balance-=money;
		}
	}
}
class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	
	void makeAccount(String id,String name, int money) {
		Account acc = new Account();
		acc.id=id;
		acc.name=name;
		acc.balance=money;
		accs[accCnt++] = acc;	//계좌 하나씩 늘려~ 배열에 저장해~
	}
	
	void allAccountInfo() {
		for(int i=0; i<accCnt; i++) {
			System.out.println(accs[i].info());	//바로 println 하니까 return이 필요 없음
		}
	}
	
	Account searchAccById(String id) {	//찾기만
		//계좌번호를 알아야 계좌 알려줄 수 있으니까 매개변수로 id 받음
		//계좌번호 모르는 사람이 왔어 그러면 돌아가!!!!!!!! 오류남
		//계좌 여러 개일 수 있는데 계좌번호를 입력 받아서 그거랑 일치하는 계좌를 찾는 거임
		//일치하는 게 없으면 null을 return 해줌
		for(int i=0; i<accCnt; i++) {
			if(accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;
	}
	
	void accountInfo(String id) {	//찾은 값으로 출력해주공
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;		//for문의 break가 method에서의 return이다
		} 
		System.out.println(acc.info());
	}
	
	void deposit(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		} 
		acc.deposit(money);		//얘는 위에 account의 deposit
	}
	
	void withdraw(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		} 
		acc.withdraw(money);
	}
}
public class ClassTest5 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.makeAccount("10001","고길동",100000);
		bank.makeAccount("10002","김길동",200000);
		
		bank.allAccountInfo();
		//계좌번호:10001,이름:고길동,잔액:100000
		//계좌번호:10002,이름:김길동,잔액:200000
		
		bank.accountInfo("10001");
		//계좌번호:10001,이름:고길동,잔액:100000
		
		bank.deposit("10001",10000);
		bank.accountInfo("10001");
		//계좌번호:10001,이름:고길동,잔액:110000
		
		bank.withdraw("10001",5000);
		bank.accountInfo("10001");
		//계좌번호:10001,이름:고길동,잔액:105000

//		Account acc1 = new Account();
//		acc1.id="10001";
//		acc1.name="고길동";
//		acc1.balance=100000;
//		System.out.println(acc1.info());
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(20000);
//		System.out.println(acc1.info());
	}
}
