package chap07.method_override;

public class LazerPrinter extends Printer {
	// �θ� ��ü�� print() �޼ҵ带 ������ ����
	// ������ ����Ʈ�Ƿ� ������ ������� ����� �ϰ��� ��
	// �޼ҵ� �������̵� (Override) <-> Overloading(�Ű����� 
	// �޼ҵ带 ������ (Overriding)

	@Override
	public void print(String data) {
		System.out.println("�������� ����մϴ�(" + data + ")");
		//		super.print(data);		// ����Ʈ�� �θ��� �޼ҵ带 ���
	}
}
