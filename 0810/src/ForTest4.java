
public class ForTest4 {

	public static void main(String[] args) {
		int cnt=5;
		for(int i=0; i<cnt; i++)	{
			for(int j=0; j<cnt-i; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		for(int i=0; i<cnt; i++)	{
			for(int j=0; j<i; j++)	{	//space
				System.out.print(" ");
			}
			for(int j=0;j<cnt-i; j++)	{	//star
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//*****		i=0, 5, j<5
//****		i=1, 4, j<4
//***		i=2, 3, j<3
//**		i=3, 2, j<2
//*			i=4, 1, j<1

//*****		i=0, SP:0, ST:5(cnt-i)
// ****		i=1, SP:1, ST:4
//  ***		i=2, SP:2, ST:3
//   **		i=3, SP:3, ST:2
//    *		i=4, SP:4, ST:1

