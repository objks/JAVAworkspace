import java.util.Scanner;

public class answp7 {

	public static void main(String[] args) {
		/* Ű����� ���� �Է¹޾� �μ��� ū���� ����Ͻÿ� (��, �񱳿����� ���׿����ڸ� �̿��Ͻÿ�) */
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ΰ� �Է� : ");
		int a = scan.nextInt();
		System.out.print("���� �ΰ� �Է� : ");
		int b = scan.nextInt();
		
		int result = (a < b ? b : a); 
			System.out.println(result);		
	}

}
