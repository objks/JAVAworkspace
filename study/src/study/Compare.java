package study;

public class Compare {

	public static void main(String[] args) {
		// String : ���̺귯��
		// int num;
		// ����ü : C��� ������
		// str1 : ������ char* ptr = "ȫ�浿";
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		if (str1 == str2) {
			System.out.println("������ ���� ����Ű�� ����");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}

		if (str2 == str3) {
			System.out.println("������(���� ��ü) ���̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�--");
		}

		// �ּҸ� ��, ������ ��(equals() �޼ҵ带 ���)
		if (str1.equals(str2)) {
			System.out.println("���� �����̴�");
		} else {
			System.out.println("�ٸ� �����Դϴ�");
		}
		// �ּҸ� ��, ������ ��(equals() �޼ҵ带 ���)
		if (str2.equals(str3)) {
			System.out.println("���� �����̴�");
		} else {
			System.out.println("�ٸ� �����Դϴ�");
		}

	}

}
