package chap07.Exer07;

public class SnowTireExam {

	public static void main(String[] args) {
		Tire snowTire = new Tire();
		Tire tire = snowTire;		// �ڵ�Ÿ�Ժ�ȯ		
		snowTire.run();			// �ڽ��� �������� �޼ҵ尡 ȣ���
		tire.run();				// �θ�Ÿ������ run()�� ȣ���ϸ�
			// �θ��� �޼ҵ� run()�� ������� �ʰ� �ڽ��� �������� run()�� ȣ���
	}

}
