package chap05;

import java.util.Scanner;

public class Exer5_9 {

	public static void main(String[] args) {
		// ������ : ������ �Է� �޴´� -> �ְ������� �������
		// ���� : �ּҰ� =0, �ִ밪=100
		// �ִ밪�� ���� �ʱ�ġ 
		// �޴� ���� : 	1. �л��� (�迭�� ũ��)
		// 		    2. �����Է� : �迭�� ����, �ִ밪�� ���� ���Ѵ�
		//			3. ���� ����Ʈ : �迭�� ���
		//			4. �м� : �ְ�����, ��� ���
		//			5. ���� : run = false
		boolean run = true;	// �޴��� �Է¹ޱ� ���� �ݺ��� -> while
		int studentNum=0;	
		int scores[] = null;	// 1���� �迭 ����(��������)
		Scanner scanner=new Scanner(System.in);
		int max = -1;	// �ʱ�ġ�� �ּҰ� -> �Էµ����ʹ� �ִ밪(���� : ���Ǵ� ����)
		int sum;
		double avg;
		
		while(run) {	// �U�� �ݺ�
			// Ư�� ���� : ���� �޴��� ���� -> �ݺ����� ������� ó��
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1. �л��� | 2. �����Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.printf("���� > ");
			
			int selectNo = scanner.nextInt();	// int �Է�(�޴�)
			
			if (selectNo == 1) {
				// ��) �л� ��> 3
				System.out.printf("�л��� > ");
				studentNum = scanner.nextInt();
				// �迭�� ����
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				// �л� ����ŭ ������ �Է�
				// ��) scores[0] > 80
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[" +i + "]> ");
					scores[i] = scanner.nextInt();
				}
				// �ִ밪�� �� ->
			} else if (selectNo == 3) {	// ��������Ʈ
				for (int i = 0; i < studentNum; i++) {
					// ��) scores[0] : 85
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) { // �м� : �ְ�����, ������� ���
				max = -1; // �޴��� 4. �м��� �����Ҷ����� �ٽ� ���
				sum = 0;
				for (int i = 0; i < studentNum; i++) {
					// ���ο� �ִ밪�� ���Ѵ�.
					if (max < scores[i])
						max = scores[i];
					// ���� ���Ѵ�.
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
			}
			else if(selectNo==5){	// ����
				run = false;	// �ݺ����� ���ǽ� run -> �ݺ����� ����� ����
				
			}
		}
		System.out.print("���α׷� ����");
	}

}
