package ch2;

public class ForFor {

	public static void main(String[] args) {
		// �ֻ��� �� ���� ������ 7�� �Ǵ� ����� ���� ��� ����Ͻÿ�
		for(int i=1; i <7; i++) {
			for(int j=1; j < 7; j++) {
				if(i+j==7) {
				System.out.print(i + "," );
				System.out.println(j);
				}
			}
		}
	}

}
