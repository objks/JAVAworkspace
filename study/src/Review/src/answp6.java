import java.text.DecimalFormat;
import java.text.Normalizer.Form;
import java.util.Scanner;

public class answp6 {

	public static void main(String[] args) {
		System.out.println("***** �ﰢ���� ���� ���ϱ� ****");
		Scanner scan = new Scanner(System.in);
		System.out.print("�غ� �Է� : ");
		double under = scan.nextInt();
		System.out.print("���� �Է� : ");		
		double height = scan.nextInt();
				
		double area = (double)(under * height) /2;
		System.out.printf("���� : %.2f", area);		
		
	}

}
