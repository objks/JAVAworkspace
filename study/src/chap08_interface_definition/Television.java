package chap08_interface_definition;

// �������̽��� �����Ѵ�(implements)
// ����� ��Ӱ��迡���� ����Ѵ�(extends)
// �������̽� : �������� �����ϴ�
public class Television implements RemoteControl /* , HardDisk �������� ��밡��*/ { 
	// �ʵ�
	int channel;
	
	// ������
	
	// �޼ҵ� 
	public void changeChannel(int channel) {
		
	}
	
	// Interface RemoteControl���� ������ �߻� �޼ҵ带 ������(�ʼ�)
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�ڷ����� ������ " + volume +"���� ����");
	}

	// ����Ʈ �޼ҵ�� ���� �޼ҵ�� �������ִ�.
}
