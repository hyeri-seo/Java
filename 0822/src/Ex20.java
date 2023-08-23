
public class Ex20 {
	
	static int[] shuffle(int[] arr) {
//		int[] mixarr = new int[arr.length];
//		System.arraycopy(arr, 0, mixarr, 0, arr.length);
		int[] mixarr = arr.clone();
		for(int i = 0; i<100; i++) {
			int idx1 = (int)(Math.random()*arr.length);
			int idx2 = (int)(Math.random()*arr.length);
			int temp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = temp;
		}
		return mixarr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		System.out.println("---------------------------------");
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(original == result);
		
//		shuffle(origianl);
//		System.out.println(java.util.Arrays.toString(origianl));
	}

}
