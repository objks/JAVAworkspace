import java.util.Scanner;

public class answp7 {

	public static void main(String[] args) {
		/* 키보드로 수를 입력받아 두수중 큰수를 출력하시오 (단, 비교연산은 삼항연산자를 이용하시오) */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 두개 입력 : ");
		int a = scan.nextInt();
		System.out.print("정수 두개 입력 : ");
		int b = scan.nextInt();
		
		int result = (a < b ? b : a); 
			System.out.println(result);		
	}

}
