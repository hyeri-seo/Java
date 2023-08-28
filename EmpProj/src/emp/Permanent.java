package emp;

public class Permanent extends Employee {
	int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Permanent() {}
	public Permanent(int id, String name, int salary) {
		super(id, name);		//super로 부모 생성자를 명시적으로 지정해줌
		this.salary = salary;
	}
	
	public int getPay() {
		return getSalary();
	}
	
	@Override	//@-at
	public String info() {
		return super.info()+", 급여:"+getPay();
	}
	//info 컨트롤+스페이스바
}
