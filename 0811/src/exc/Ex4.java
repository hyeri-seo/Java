package exc;

public class Ex4 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
		int sum = 0, i;
		for(i=1;;i++)	{
			//i가 100보다 작다는 것을 여기에 넣으면 i가 한 번 더해진 채로 되기 때문에 하나 빼줘야 하는 상황이 발생함.그래서 i가 100보다 작다는 것을 아래에서 명시한 것임
//			if(i%2==0) sum+=-i;
//			else sum+=i;
			sum += (i%2==0)? -i:i;
			if(sum>=100) break;
		}
		System.out.println("sum:"+sum+", i"+i);
	}

}
