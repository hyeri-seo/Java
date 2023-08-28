class MyArray {		//singleton object. 생성자를 private으로 만들어서 객체를 하나만 만들어서 같이 쓰는 것. 외부에서는 사용할 수 없음
	private int[] arr = new int[10];
	private static MyArray myArray;
	private MyArray() {}
	public static MyArray getMyArrayReference() {
		if(myArray==null) {
			myArray = new MyArray();
		}
		return myArray;	//null이 아니면 if문 건너 뜀
	}
	public void setData(int idx, int data) {
		arr[idx] = data;
	}
	public int getData(int idx) {
		return arr[idx];
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		System.out.println(ma1==ma2);
		ma1.setData(0, 100);
		System.out.println(ma2.getData(0));

	}

}
