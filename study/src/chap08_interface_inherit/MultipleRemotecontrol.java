package chap08_interface_inherit;

import chap08_multiple_interface.RemoteControl;
import chap08_multiple_interface.Searchable;

public interface MultipleRemotecontrol extends RemoteControl, Searchable {
	// RemoteControl : �߻�޼ҵ� ����
	// RemoteControl Interface������ default �޼ҵ� -> �߻�޼ҵ带 ���� ����
	void setMute(boolean mute);
	
	// Searchable : �߻�޼ҵ� ����
	
	// �ڽ� �������̽��� �߻�޼ҵ带 ���� �߰�
	
	void changeChannel(int cahnnel);
}
