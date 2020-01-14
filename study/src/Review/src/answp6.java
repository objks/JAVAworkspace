import java.text.DecimalFormat;
import java.text.Normalizer.Form;
import java.util.Scanner;

public class answp6 {

	public static void main(String[] args) {
		System.out.println("***** 삼각형의 넓이 구하기 ****");
		Scanner scan = new Scanner(System.in);
		System.out.print("밑변 입력 : ");
		double under = scan.nextInt();
		System.out.print("높이 입력 : ");		
		double height = scan.nextInt();
				
		double area = (double)(under * height) /2;
		System.out.printf("넓이 : %.2f", area);		
		
	}

}
