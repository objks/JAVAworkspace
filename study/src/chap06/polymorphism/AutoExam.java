package chap06.polymorphism;

public class AutoExam {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D ();
		B b2 =d;		// �ڵ�Ÿ�Ժ�ȯ
		b2 = c; 		// ����(�ڵ�Ÿ�Ժ�ȯ�� �Ұ���)
		b2 = e;			// ����(�ڵ�Ÿ�Ժ�ȯ�� �Ұ���)
	}

}
