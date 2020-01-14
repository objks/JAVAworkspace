import java.util.Scanner;

public class answp8 {

	public static void main(String[] args) {
		/*
		 * 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!" 출력 (if문과 ||연산자를 이용하시오) 점수입력 : 120 입력오류!!
		 * 점수입력 : 55 입력된값 : 55
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		
		if ( a > 100 || a < 0 ) {
			System.out.println("입력 오류 !!");
		} else
			System.out.println(a);
	}

}
