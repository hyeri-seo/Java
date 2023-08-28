class MyButton {
	String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void click() {
		System.out.println("쏙 들어갔다 나옴");
	}
}

class LoginButton extends MyButton {

	@Override
	void click() {
		super.click();
		System.out.println("로그인 처리");
	}
	
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		MyButton loginBtn = new MyButton();
		loginBtn.setTitle("로그인");
		loginBtn.click();
	}

}
