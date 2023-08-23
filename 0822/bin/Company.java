
public class Company {
	Employee[] emps = new Employee[1000];
	int empCnt;
			
	void enter(Employee emp) {	//회원을 집어넣는다. 신입사원
		emps[empCnt++] = emp;
	}
	void setBonus(int id, int money) {	//어떤 사원인지 찾아서 보너스를 해줘야 함
		Employee emp = null;
		for(int i=0; i<empCnt; i++) {	//index가 저장된 마지막 사람의 번호임
			if(emps[i].id==id) {		//회원의 id를 찾아야 함
				emp = emps[i];
				break;
			}
		}
		if(emp==null) {
			System.out.println("사번이 틀립니다.ㅏ");
			return;
		}
		emp.payBonus(money);
	}
	void allEmployeeInfo() {
		for(int i=0; i<empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}
	int getTotalPay() {		//void는 반환 안 하겠다는 의미니까 사라져야 함
		int tot = 0;
		for(int i=0; i<empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}	

	public static void main(String[] args) {
		Company com = new Company();
		
		Employee emp1 = new Employee(10001, "홍길동", "홍보부", 5000000);
		Employee emp2 = new Employee(10002, "고길동", "총무부", 3500000);
		Employee emp3 = new Employee(10003, "하길동", "개발부", 4000000);
		
//		클래스도 타입임

		
		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		com.setBonus(10001, 1000000);
		
		com.allEmployeeInfo();
		System.out.println("총급여액:"+com.getTotalPay());
	}

}

// 샐러리랑 보너스랑 따로 해보아라.


/*
 * 사번: 10001, 이름: 홍길동, 부서: 홍보부, 급여: 6000000
 * 사번: 10002, 이름: 고길동, 부서: 총무부, 급여: 3500000
 * 사번: 10003, 이름: 하길동, 부서: 개발부, 급여: 4000000
 * 총급여액: 13500000
 */