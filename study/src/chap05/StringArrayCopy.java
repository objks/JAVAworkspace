package chap05;

public class StringArrayCopy {

	public static void main(String[] args) {
		String str[] = { "�ڹ�", "C���", "DBMS" }; // �迭�� ���� 3
		String more[] = new String[15]; // �迭�� ���� 15
		
		System.arraycopy(str, 0, more, 0, str.length);
		
		// ���� ����(�ּҰ� ����)
		for (int i = 0; i < more.length; i++) {
			System.out.println(more[i]);
		}
		for(int i=0;i<str.length;i++) {
			if(str[i] == more[i])	// �ּ� ��
				System.out.println("���� ��ü�� ����");
			else
				System.out.println("�ٸ� ��ü�� ����");
		}
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		// ���� ����(������ ����) : ����ǰ. ���ο� ��ü�� �����.
		for (int i = 0; i < str.length; i++) {
			more[i] = new String(str[i]);
		}
		for (int i = 0; i < more.length; i++) {
			System.out.println(more[i]);
		}
		for(int i=0;i<str.length;i++) {
			if(str[i] == more[i])	// �ּ� ��
				System.out.println("���� ��ü�� ����");
			else
				System.out.println("�ٸ� ��ü�� ����");
		}
	}

}
