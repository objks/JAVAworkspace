import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// 윤년 판단 프로그램
		// 연도가 4로 나누어 떨어지면 윤년이다.
		// 400으로 나누어 떨어지는 연도는 윤년이다.
		// 100으로 나누어 떨어지는 연도는 제외한다.
		// 사용자로 부터 연도를 입력받아 윤년인지 알려주는 프로그램
		System.out.print("연도를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year%4==0 && year%400==0) {			 
			System.out.println(year + "년은 윤년입니다");
		} else if(year % 100 ==0) 
			System.out.println(year + "윤년이 아닙니다");
	}

}
