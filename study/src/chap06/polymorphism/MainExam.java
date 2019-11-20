package chap06.polymorphism;

public class MainExam {

	public static void main(String[] args) {
		Dog dog = new Dog();	// ��
		dog.age = 11;	// �θ� ������ �ʵ�
		dog.sound();	// �۸� (�ڽ��� �������� �޼ҵ�)
		dog.method1();	// �θ� ������ �޼ҵ�
		dog.count = 2;	// �ڽ��� ������ �޼ҵ�
		// �������� dog�� ����ؼ� ���� ������ �� : �θ� + �ڽ�
		
		// �ڵ�Ÿ�Ժ�ȯ : �θ�ü�� �ڽİ�ü�� ���Թ޴� ��
		Animal animal = dog;	// �ڵ�Ÿ�Ժ�ȯ
		animal.kind = "��";	// �θ� ������ �ʵ�
		animal.age = 12;	// �θ� ������ �ʵ�
//		animal.count = 2;	// ���� -> animal ���������� Animal
			// Ÿ���̹Ƿ� �θ� ������ �ʵ�� �޼ҵ常 ���� ����
//		animal.method();	// ����
		animal.sound();		// �θ� �θ� �޼ҵ� -> ���� (������) -> ������
		animal.method1();
		Animal a2 = new Cat();	// �ڵ�Ÿ�Ժ�ȯ
		a2.sound();	// �θ��� �޼ҵ尡 ȣ����� �ʰ� �ڽ��� �������� �޼ҵ尡 ȣ���
		a2 = dog;
		a2.sound();
		// �θ�Ÿ���� ���������� � �ڽ� ��ü�� �����ϴ��Ŀ� ����
		// ������ �ڽ��� ������ ���´�.(�޼ҵ尡 ����ȴ�.)
	}

}
