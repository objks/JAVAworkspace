package chap07.method_override;

public class SuperExam {

	public static void main(String[] args) {
		SuperSonicPlane ssp = new SuperSonicPlane();
		ssp.setMode(1);
		ssp.fly();			// �Ϲ� ���� 
		ssp.setMode(2);
		ssp.fly();			// ������ ����
		Airplane ap = ssp;
		ap.fly();
		// �޼ҵ� ������ Ư¡ : �ڽ��� �������� �޼ҵ尡 ȣ���
	}

}
