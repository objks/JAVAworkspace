package chap06.polymorphism;
//�ڹ� : �ڽ��� �θ� �����ؼ� ����� �Ѵ�.
//�θ�� �ϳ��� ���� ����, C++ : ���� �� ����
//�θ��� �ʵ�, �޼ҵ带 ��� ����
public class Dog extends Animal {
	int count;		// 1�⿡ �а��� Ƚ��
	
	public void method() {
		sound();	// �θ� ������ �޼ҵ带 ���
		age = 10;	// ���� : �θ� ������ �ʵ带 ���
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�!");
	}
}
