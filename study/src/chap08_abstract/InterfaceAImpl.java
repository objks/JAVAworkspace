package chap08_abstract;

//���� Ŭ����
public class InterfaceAImpl implements InterfaceA {

	// ���, default �޼ҵ�, �����޼ҵ嵵 ����
	// ������ �������̽��� �߻�޼ҵ带 ������
	@Override
	public void method1() {
		System.out.println("InterfaceAImpl:method1() ȣ���");
	}

	// Ŭ���� : �ʵ�, ������, �ٸ� �޼ҵ�
	int field1;
	
	// ������
	public InterfaceAImpl(int field1) {
		this.field1 = field1;
	}
	
	// �޼ҵ�
	public void method3() {
		System.out.println("InterfaceAImpl : method2() ȣ���");
	}
}
