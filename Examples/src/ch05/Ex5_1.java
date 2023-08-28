package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// 다음은 배열을 선언하거나 초기화 한 것이다.
		//잘못된 것을 고르고 그 이유를 설명하시오.
		a. int[] arr[];							// 이중배열?
		b. int[] arr = {1,2,3,}; 				// 마지막의 쉼표‘,’는 있어도 상관없음.
		c. int[] arr = new int[5];
		d. int[] arr = new int[5]{1,2,3,4,5}; 	// 틀림. 두 번째 대괄호[]에 숫자 넣으면 안됨.
		e. int arr[5]; 							// 틀림. 배열을 선언할 때는 배열의 크기를 지정할 수 없음.
		f. int[] arr[] = new int[3][];
	}

}

// d. int[] arr = new int[]{1,2,3,4,5}에서는 대괄호[]안에 배열의 크기를 지정할 수 없다.
//괄호{}안의 데이터의 개수에 따라 자동적으로 결정되기 때문이다.
