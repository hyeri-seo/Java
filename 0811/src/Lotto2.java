
public class Lotto2 {

	public static void main(String[] args) {
		int ball[] = new int[6];
		int cnt = 0;
		boolean same = false;
		
		while(true)	{
			int rand = (int)(Math.random()*45)+1;
			//ball 배열에서 rand와 같은 값이 있는지 체크
			same = false;
			for(int i=0; i < cnt; i++)	{
				if(ball[i]==rand)	{
					same = true;
					break;
				}	//같은 게 없으면 안 거르고 그냥 나옴. 초기값 false 그대로 갖게 됨
					//같은 게 없으면 ball에 넣게 됨
					//cnt는 counting 역할을 하기도 하고 몇 번째 역할을 하기도 함
					//같은 게 있으면 cnt 증가 안 하고 다시 돌아감
			}
		if(same==false)	{
			ball[cnt++] = rand;	//cnt는 자기가 몇 번째인지, 그리고 데이터가 뭔지 알려주는 역할 모두 함
			}
		if(cnt==6) break;
		}
	for(int i=0; i<ball.length; i++)	{
	}	
	}
}

//랜덤의 index가 클수록 같은 값이 나올 확률이 줄어듦
//처음에는 하나도 안 뽑았으니가 cnt가 0
//나중에는 쌓임. 같은 게 하나라도 있으면 안 됨
//반복문에서는 들어가서 볼의 cnt만큼 비교
//하나라도 같은 게 있으면 true
//false인 경우에만 볼을 배열에 넣고 cnt 증가시킴