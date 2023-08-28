package Ex5;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum="+sum);
	}

//최종찬씨.	
	public static void main_(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = {"국어", "영어", "수학", "과학"};
		int[] score = {0, 0, 0, 0};
		for (int i=0;i<4;i++) {
			System.out.print(subject[i] + " 점수 : ");
			score[i] = sc.nextInt();
		}
		
		for (int i=0;i<4;i++) {
			System.out.println("당신의 " + subject[i] + " 점수는 " + score[i] + "입니다.");
		}
	}
}
