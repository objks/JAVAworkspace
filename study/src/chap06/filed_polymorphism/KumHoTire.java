package chap06.filed_polymorphism;

public class KumHoTire extends Tire {
	// ������ : default ������ -> �θ��� �����ڸ� ȣ��
	public KumHoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �ڽ� ��ü���� �θ��� �޼ҵ带 ������
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	// ��� ��� ����
			System.out.println(location + " KumHoTire ���� : " +
					(maxRotation - accumulatedRotation));
			return true;
		} else {	// ������ ���� (��ũ)
			System.out.println("***" + location + " KumHoTire ��ũ ***");
			return false;
		}
	}
}
