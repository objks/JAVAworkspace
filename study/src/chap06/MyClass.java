package chap06;

public class MyClass {
	// ���� ���
	// 1. �ʵ� : Ŭ������ �Ӽ�, ����, ����ǰ
	int field1;
	String field2;
	
	// 2. ������ : �ʵ��� �ʱ�ȭ -> ������ �޼ҵ� 
	public MyClass() {
		this.field1 = 10;	// �ʱ�ȭ
		field2 = "����";
	}
	
	// 3. �޼ҵ� : �ʵ尪�� �����Ű�� ����, ����
	public void method1() {	// �ʵ带 ����� �޼ҵ�
		System.out.println("field1 = " + field1);
	}
	
	// add()
	public int method2(int a, int b){	// �ʵ带 ������� ���� �޼ҵ�
		return a + b;
	}
	
	// �ʵ� field1�� ���� �Ű������� ���޵� field1���� ����(����)
	public void setField1(int field1) {	// �Ű������� �ʵ��� ���� ���
		this.field1 = field1;		// �Ϲ������� ���� �̸��� ���� ����Ѵ� ->
									// �ʵ�� �Ű������� �����ϱ� ���ؼ� this.�� ���
		field3 = 10;
	}
	
	public void setField1(String f2) {	// �Ű������� �ʵ��� �ٸ� ���
		field2 = f2;		// this�� ������ �ʾƵ� �ȴ� : ������ �����ϱ� ������
	}
	
	int field3;
}
