import java.util.Scanner;

public class answp9 {

	public static void main(String[] args) {
		/*
		 * 입력된 문자가 대문자이면 소문자로 출력하고 소문자이명 대문자로 변환하여 출력하시오
		 * 그외의 문자이면 "입력데이타오류"라고 표시하시오 (if-else문 이용) Input Character: A result : a Input
		 * Character: a result : A Input Character: * 입력데이터 오류
		 */

		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("문자입력 : ");
		ch = scan.next().charAt(0);		
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("결과 : " + (char)(ch + 32));
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("결과 : " + (char)(ch - 32));
		} else {
			System.out.println("입력 데이터 오류");
		}
	}

}
