package chap07.inherit_constructor;

public class A {
	int f1;
	String s1;
	
	// ����Ʈ �����ڰ� ����
//	public A() {
//		System.out.println("A() �����ڰ� ȣ���");
//	}
	
	public A(int f1, String s1) {
		this.f1 = f1;
		this.s1 = s1;
	}
}
