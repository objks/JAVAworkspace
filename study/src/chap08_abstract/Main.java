package chap08_abstract_class;

public class MainExample {

	public static void main(String[] args) {
		Aclass a = new Aclass();	// Aclass�� �߻�Ŭ�����̹Ƿ� ��üȭ(�� ����) �Ұ�
		Bclass b = new Bclass();	// �߻�Ŭ������ �ƴϹǷ� ��üȭ�� ����
		b.method1();
		b.method2();
		
		Cclass c = new Cclass();	// �߻�Ŭ������ ��üȭ �Ұ���
		Dclass d = new Dclass();
		d.method1();
		d.method2();
	}

}
