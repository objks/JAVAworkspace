import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// ���� �Ǵ� ���α׷�
		// ������ 4�� ������ �������� �����̴�.
		// 400���� ������ �������� ������ �����̴�.
		// 100���� ������ �������� ������ �����Ѵ�.
		// ����ڷ� ���� ������ �Է¹޾� �������� �˷��ִ� ���α׷�
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year%4==0 && year%400==0) {			 
			System.out.println(year + "���� �����Դϴ�");
		} else if(year % 100 ==0) 
			System.out.println(year + "������ �ƴմϴ�");
	}

}
