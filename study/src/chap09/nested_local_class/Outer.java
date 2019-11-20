package chap09.nested_local_class;

public class Outer {
	public int field1;
	
	void method2() { }
	
	void method4() { }

	// �ʵ�, ������, �޼ҵ�
	
	public void method(int arg, int arg2) {
		int localVar = 10;		// ���� ����
		int localVar2 = 20;
		
//		arg = 20;				final ������
//		localVar = 30;			final -> ���� �Ұ�
		arg2 = 50;				// ���� ����
		localVar2 = 100;		// �Ϲ����� ������ ��������
				
		// ���� Ŭ���� : �޼ҵ�ȿ� �ִ� Ŭ����
		class InnerClass {
			int field1;
			
			void method2() {
				
			}
			int localMethod() {
				// Outer Ŭ������ �޼ҵ� method�� �Ű�����, ���ú����� ���� ��
				int result = arg + localVar;
				return result;
			}
			void method3() {
				this.field1 = 30;			// IneerClass�� �ִ� field1
				Outer.this.field1 = 50;		// OuterClass���ִ� field1
				method2();					// InnerClass�� �ִ� method			
				Outer.this.method2();
				method4();
			}
		}
	}
	
}
