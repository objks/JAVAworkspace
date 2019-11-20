package chap08_multiple_interface;

import chap08_interface_definition.RemoteControl;

// �������̽��� ���� �� ���� ���� 
public class SmartTv implements RemoteControl, Searchable /* ��� �ʿ��ϸ� �߰� ���� */ {
	// Searchable �߻� �޼ҵ� search() ������ 
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�");
	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ TV ������ �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ TV ������ ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("������ " + volume + "���� ����");
	}

}
