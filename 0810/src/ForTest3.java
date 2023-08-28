
public class ForTest3 {

	public static void main(String[] args) {
		int cnt=5;
		for(int i=0; i<cnt; i++)	{		//i는 줄
			for(int j=0; j<i+1; j++)	{	//j는 걍 이해해라. 변수는 별 의미 없고 흐름을 보셈
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=cnt; i>0; i--)	{
			for(int j=i; j>0; j--)	{	//j가 cnt가 되면 계속 별이 5개씩 찍힘 그러니까 cnt가 아니라 i여야 함
										//j++로 하면 j=cnt-i
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

