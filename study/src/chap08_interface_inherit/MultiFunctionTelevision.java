package chap08_interface_inherit;

public class MultiFunctionTelevision implements MultipleRemotecontrol {

	@Override
	public void turnOn() {
		System.out.println("�ٱ��TV ���� ON");
	}

	@Override
	public void turnOff() {
		System.out.println("�ٱ��TV ���� OFF");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("���� ����");
	}
	
	// searchable �������̽��� �ִ� �߻�޼ҵ带 ������
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

	}

	// MultipleRemoteControl���� ������ �߻�޼ҵ带 ������
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

}
