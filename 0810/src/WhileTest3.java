
public class WhileTest3 {

	public static void main(String[] args) {
		//int sum=0, i=0;
		//while(sum<100)	{
		//		i++;
		//		sum+=i;
		//}
		int sum=0, i=1;
		while(true) {
			sum += i;
			if(sum>=100) break;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
	}

}

//1+2+3+4+...
