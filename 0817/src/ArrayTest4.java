
public class ArrayTest4 {

	public static void main(String[] args) {
		char[] hex = new char[] {'C', 'A', 'F', 'E', '2', '0', '2', '3'};
		String[] binary = new String[] {
				"0000", "0001", "0010", "0011",	//0, 1, 2, 3
				"0100", "0101", "0110", "0111",	//4, 5, 6, 7
				"1000", "1001", "1010", "1011",	//8, 9, A(10), B(11)
				"1100", "1101", "1110", "1111"	//C(12), D(13), E(14), F(15)
		};
		
		String result = "";
		
		for(int i=0; i<hex.length; i++) {
			char ch = hex[i];
			if(ch >= '0' && ch <= '9')	{
				result += binary[ch-'0'];
			} else {
				result += binary[9+ch-'A'+1];
			}
		}
		
		System.out.println("hex:"+new String(hex));	//캐릭터 배열을 문자열로 바꿔줌
		System.out.println("binary:"+result);
		
		//'0' => 0000 (binay[0])	'0'-'0'
		//'1' => 0000 (binay[1])	'1'-'0'
		//'9' => 0000 (binay[9])	'9'-'0'
		
		//'A' => 1010 (binay[10])	9(앞에 9까지 채워져 있으니까)+'A'-'A'+1 = 10
		//'B' => 1010 (binay[11])	9+'B'-'A'+1 = 11
		//'F' => 1010 (binay[15])	'F'-'A' => 69-65+1 = 5

		
	}

}
//출력결과
//hex: CAFE2023
//binary: 11001010111111100010000000100011