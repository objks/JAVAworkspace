package chap08_abstract;

import org.omg.CORBA.PUBLIC_MEMBER;

public class InterMain {

	public static void main(String[] args) {
	InterfaceA ia = new InterfaceAImpl(10);	//�ڵ�Ÿ�Ժ�ȯ
	// �������̽����� ������ �κи� ���δ�(��� ����)
	ia.method1();
	ia.method2();
	ia.method3();		// �������̽�Ÿ���̹Ƿ� �Ⱥ���
	InterfaceAImpl ii = (InterfaceAImpl)ia;		// ����Ÿ�Ժ�ȯ
	ii.field1 = 20;
	ii.method3();
	
	// �͸�����ü : ���Ǵ� ������ ���Ǹ��ؼ� ���
	InterfaceA c = new InterfaceA() {
		int field2;
		
		@Override
		public void method1() {
			System.out.println("��ž�ڽ� method1() ȣ���");
			int sum = add(10,20);
			method4();
		}
		int add(int a, int b) {
			return a+b;
		}
		void method4() {
			
		}
	};
	c.method1();
//	c.field2 = 10;	������ü���� ������ �ʵ�, �޼ҵ�� ���Ұ�
	}

}
