package chap05;
import java.util.Scanner;

public class Exer4_7 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		int menu;
		int num1=0;
		
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("�ѤѤѤѤѤ�----------------�ѤѤѤѤѤ�");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("�ѤѤѤѤѤ�----------------�ѤѤѤѤѤ�");
			System.out.print("���� > ");
			menu=scanner.nextInt();
			
			// �ۼ�
			if (menu==1){
				System.out.printf("���ݾ� > ");
				num1=scanner.nextInt();
				balance+=num1;
			} 
			else if(menu==2){
				System.out.printf("��ݾ� > ");
				num1=scanner.nextInt();
				if(balance > num1)
					balance-=num1;
				else
					System.out.println("�ܰ� ���� : " +balance);
			}			
			else if(menu==3){
				System.out.printf("�ܰ� > ");
				System.out.println(balance);
			} 
			else if(menu==4){
				run = false;
			}
			else{
				System.out.println("�ùٸ� �޴��� �Է��ϼ��� : "+menu);
		}
	}
		System.out.println("���α׷� ����");
	}
}
