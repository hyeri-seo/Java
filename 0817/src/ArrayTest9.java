
public class ArrayTest9 {

	public static void main(String[] args) {
		int[] narr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] darr = new int[4];
		System.arraycopy(narr1, 3, darr, 0, 4);
		
		for(int i=0; i<darr.length; i++)	{
			System.out.print(darr[i]+",");
		}
		
	}

}
