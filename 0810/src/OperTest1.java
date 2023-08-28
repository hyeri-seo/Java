
public class OperTest1 {

	public static void main(String[] args) {
		int i=100;
		String grade="";
		if(i>=90) {
			grade="A";
			if(i>=97) {
				grade+="+";
			} else if(i>=94) {
				grade+="0";
			} else {
				grade+="-";
			}
			System.out.println(grade);
		} else if(i<90 && i>=80)	{
			System.out.println("B");
		} else if(i<80 && i>=70)	{
			System.out.println("C");
		} else if(i<70 && i>=60)	{
			System.out.println("D");
		} else if(i<60 && i>=50)	{
			System.out.println("E");
		} else if(i<50 && i>=40)	{
			System.out.println("F");
		} else {
			System.out.println("0");
		}
			
		
	}

}
