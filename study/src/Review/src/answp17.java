import java.util.Scanner;

public class answp17 {

	public static void main(String[] args) {
		/* ������  x�� ���� �Է��Ͻÿ� : 3
		y�� ���� �Է��Ͻÿ� : 3
		3�� 3���� 27*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("x �� : ");
		int x = scan.nextInt();
		System.out.print("y �� : ");
		int y = scan.nextInt();
		int sum = 1;
		
		for(int i=0; i < y; i++) {
			sum *= x;
			
		}
		System.out.println(sum);
	}

}
