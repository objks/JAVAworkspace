import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int result;
		// �� ���� �Է¹޾Ƽ� ū ���� �Է��ϴ� ���α׷�
		// 1. ù �� �Է¹ޱ�
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		// 2. �ι�° �Է¹ޱ�
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = scan.nextInt();
		
		// 3. �Է¹��� �� ��
		System.out.println("�� �� ū ���� ? ");
		if(num1<num2) {
			System.out.println(num2);
		} else if (num1 == num2)
			System.out.println("���� �� �̴�");
		else {
			 System.out.println(num1);
		}
		
		// 4. ū �� ���
	}

}
