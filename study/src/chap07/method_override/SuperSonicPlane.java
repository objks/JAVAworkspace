package chap07.method_override;

public class SuperSonicPlane extends Airplane {
	int mode;	// ���� ��� 1 : �Ϲ� ������ ����, 2 : ���������� ����
	
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	@Override
	public void fly() {
		if(mode == 1)
			super.fly();
		else 
			System.out.println("���������� ���� �մϴ�.");
	}
	
	public void method() {
		super.fly();
	}
}
