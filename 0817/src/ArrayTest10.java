
public class ArrayTest10 {

	public static void main(String[] args) {
		int[] sarr = {1,2,3,4,5};
		int[] darr = sarr.clone();	//clone(): 배열을 생성하여 값을 복사하여 리턴해줌(복제). 배열이 갖고 있는 내부 메소드
		sarr[0] = 100;

		for(int i=0; i<sarr.length; i++)	{
			System.out.print(sarr[i]+",");
		}
		System.out.println();
		for(int i=0; i<darr.length; i++) {
			System.out.print(darr[i]+",");
		}
	}

}

//arraycopy는 복제가 배열 전체도 되고 일부도 됨
//clone은 배열 그대로 복제하는 것
