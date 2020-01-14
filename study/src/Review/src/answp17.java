import java.util.Scanner;

public class answp17 {

	public static void main(String[] args) {
		/* 제곱승  x의 값을 입력하시오 : 3
		y의 값을 입력하시오 : 3
		3의 3승은 27*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("x 값 : ");
		int x = scan.nextInt();
		System.out.print("y 값 : ");
		int y = scan.nextInt();
		int sum = 1;
		
		for(int i=0; i < y; i++) {
			sum *= x;
			
		}
		System.out.println(sum);
	}

}
