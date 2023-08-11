
public class ForTest3 {

	public static void main(String[] args) {
		int cnt=5;
		for(int i=0; i<cnt; i++)	{
			for(int j=0; j<i+1; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=cnt; i>0; i--)	{
			for(int j=cnt; j>0; j--)	{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

