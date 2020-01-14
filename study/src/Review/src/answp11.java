import java.util.Scanner;

public class answp11 {

	public static void main(String[] args) {
		/*
		 * 2개의 숫자와 연산자를 입력하여 계산하시오 
		 * 조건1) 실수인경우는 소수이하 2째자리까지 출력하시오 조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 "연산자error"출력하시오
		 * 
		 * [실행결과] A값을 입력하시오: 25 B값을 입력하시오: 36 연산자를 입력(+,-,*,/) : + 25 + 36 = xx
		 * 
		 * A값을 입력하시오: 25 B값을 입력하시오: 36 연산자를 입력(+,-,*,/) : / 25 / 36 = xx.xxxxx
		 * 
		 * A값을 입력하시오: 25 B값을 입력하시오: 36 연산자를 입력(+,-,*,/) : # 연산자 error
		 */
		
		char c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("A값을 입력 : ");
		int a = scan.nextInt();
		System.out.print("B값을 입력 : ");
		int b = scan.nextInt();
		System.out.print("연산자 : ");
		c = scan.next().charAt(0);
		
		switch (c) {
		case '+':
			System.out.printf("%d %c %d = %d\n", a, c, b, a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", a, c, b, a-b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", a, c, b, a*b);
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f\n", a, c, b, (double)a/b);
			break;
		default:
			System.out.println("에러");
			break;
		}
		
	}

}
