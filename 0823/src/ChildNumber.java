

import pac.Number;

public class ChildNumber extends Number {
	void cmethod() {
		//자식이라 하더라도 부모의 private은 접근 불가
		//System.out.println(pnum);
		//자식이라 하더라도 부모와 같은 패키지가 아니면 default는 접근 불가
		//System.out.println(dnum);
		
		//패키지가 다르더라도 부모의 protected는 접근 가능
		System.out.println(prnum);
		
		//public은 어디에서든 접근 가능
		System.out.println(punum);
	}
}
