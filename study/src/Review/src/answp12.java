import java.util.Scanner;

public class answp12 {

	public static void main(String[] args) {
		/*
		 * �߰���縦 �Է��Ͻÿ� : 90 �⸻��縦 �Է��Ͻÿ� : 89 ����Ʈ��縦 �Է��Ͻÿ� : 99 �⼮��縦 �Է��Ͻÿ� : 100
		 * 
		 * �߰���� : 90 �⸻��� : 89 ����Ʈ : 99 �⼮ : 100
		 * 
		 * ����=93.20 <---�Ҽ����� 2°�ڸ����� ����=A System.out.printf("���� : %.2f", avg);
		 * ��=excellent
		 * 
		 * 
		 * ����1) (�߰�+�⸻)/2 ---> 60% ����Ʈ ---> 20% �⼮ ---> 20%
		 * 
		 * ����2) 90�̻� 'A'���� (3)A,B���� ---->"excellent" 80�̻� 'B'���� C,D���� ---->"good" 70�̻�
		 * 'C'���� F���� ---->"poor" 60�̻� 'D'���� (switch���̿�) ������ 'F'���� (if~else if���̿�)
		 */
		
		int middle, finals;
		double attend, report;
		char grade;
		String app = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�߰���� : ");
		middle = scan.nextInt();
		
		System.out.print("�⸻��� : ");
		finals = scan.nextInt();
		
		System.out.print("����Ʈ : ");
		report = scan.nextInt();
		
		System.out.print("�⼮ : ");
		attend = scan.nextInt();
		
		double mifi = ((middle+ finals) /2) * 0.6;
		report = report * 0.2;
		attend = attend * 0.2;
		
		double result = mifi + report + attend;
		System.out.println(result);
		
		if ( result >= 90 ) 
			grade ='A';
		else if (result >= 80 )
			grade ='B';
		else if (result >= 70 )
			grade ='C';
		else if (result >= 60 )
			grade ='D';
		else
			grade ='F';
		
		
		switch (grade) {
		case 'A' :
		case 'B' :	
			app = "excellent";
			break;
		case 'C' :
		case 'D' :	
			app = "good";
		case 'F' :	
			app = "poor";
		default:
			break;
		}
		
		System.out.printf("���� : %.2f\n" , result);
		System.out.println("���� : " + grade);
		System.out.println("�� : " + app);
	}

}
