interface IClick {

	void iclick();
	
}
class BasicButton {
	String title;
	IClick iClick;
	void click() {
		System.out.println("버튼 기본 처리");
		if(iClick!=null) {
			iClick.iclick();
		}
	}
	void addClickEventHandler(IClick iClick) {
		this.iClick = iClick;
	}
}
// 여기까지는 이미 있는 거라고 생각하면 됨. 버튼은 버튼을 사용하게끔 다른 개발자를 위해 만들어놓은 거임

class LoginClick implements IClick {	//아이클릭을 상속 받아서 구현해야겠구나~
	//메소드에 인터페이스가 있다는 얘기는 걔를 갖고 있으면 내가 구현해주겠다고~~
	//타입을 보고 아 얘를 오버라이딩 해야겠구낭~
	@Override
	public void iclick() {
		System.out.println("로그인 처리");
	}
	
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		BasicButton loginBtn = new BasicButton();
		loginBtn.addClickEventHandler(new LoginClick());
		loginBtn.click();
		BasicButton joinBtn = new BasicButton();
		joinBtn.addClickEventHandler(new IClick() {

			@Override
			public void iclick() {
				System.out.println("회원가입 처리");
			}
			
		});
		joinBtn.click();
		
	}

}
