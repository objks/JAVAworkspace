package ch2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// 정수가 들어가는 10개의 배열을 만들고 사용자로부터 10개를 입력받아 각각에 넣고
		// 값이 들어있는 배열을 이용해서 평균값을 구해 출력한다.
		//그리고 입력했던 값을 보여준다.		
		
		int num[] = new int[10];
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< 10; i++) {
			System.out.print("숫자 10개를 입력하세요 : ");
			num[i] = scan.nextInt();	
			sum += num[i];
		}
		for(int i=0; i<10; i++) {
			System.out.print(num[i]);			
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/10);
	}

}
