package chap07.inherit_constructor;

public class B extends A {
	int f3;
	
	// 1. ����Ʈ ������
//	public B() {
//		super();
//		System.out.println("B() �����ڰ� ȣ���");
//	}
	
	public B(int f1, String s1) {	// super : �θ� Ŭ����
		super(f1, s1);	// ���� �θ� �����ؾ� �� -> �θ� �����ڰ� ȣ���
	}
	
	public B(int f1, String s1, int f3) {
		super(f1, s1);	// ���� �θ� �����ؾ� �� -> �θ� �����ڰ� ȣ���
		this.f3 = f3;	// this : �ڱ� �ڽ� Ŭ����
	}
}
