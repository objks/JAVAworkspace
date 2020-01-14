import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int result;
		// 두 수를 입력받아서 큰 수를 입력하는 프로그램
		// 1. 첫 수 입력받기
		System.out.print("첫번째 수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		// 2. 두번째 입력받기
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		// 3. 입력받은 수 비교
		System.out.println("둘 중 큰 수는 ? ");
		if(num1<num2) {
			System.out.println(num2);
		} else if (num1 == num2)
			System.out.println("같은 수 이다");
		else {
			 System.out.println(num1);
		}
		
		// 4. 큰 수 출력
	}

}
