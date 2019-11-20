package chap08_interface_definition;

import java.net.SocketTimeoutException;

/* �������̽� : ��ü�� ����ϱ� ���� ���� �κ�(��ü ����� �Ϻ�)
 * ������� : ���(static final), �޼ҵ�
 * 		      Ŭ������ ������, �ʵ� X
 * 			���, �޼ҵ� : ���������� public
 */
public interface RemoteControl {
	// ���
	public static final int MAX_VOLUME = 10;
		// ���� ������ public�� �����ص� �⺻�� public��
	static final int MIN_VOLUNE=0;
	int MIN_VOLULE = 0;
//	public static final int MIN_VOLUME=0; �����ٰ� ���� ��. ����� ��
	
	// �޼ҵ� : �߻�, ����Ʈ, ����
	// �߻�޼ҵ� : ��ȯ�� �޼ҵ��̸�(�Ű����� ...); // �����κ��� ���� �޼ҵ�
		// ���� Ŭ�������� ������ ����� ��
	
	public void turnOn();	// ���� �Ǿ� �ְ� �����κ��� ���� �޼ҵ�
	public void turnOff();
	public void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� : ����κ��� �ִ� �޼ҵ� -> ���� Ŭ�������� �� �������� �ʿ����(�׷����� ���� �������ؼ� ���)
	// default Ű���带 ���
	// �������̽��� ��� ���� -> ��ӹ��� �������̽��� default �޼ҵ带 �߻�޼ҵ�� ���� �� ����
	
	default void setMute(boolean mute) {		// ���� �κ��� ����
		if(mute) {
			System.out.println("���� ó���� �մϴ�.");
		} else {
			System.out.println("���� ������ �մϴ�");
		}		
	}
	
	// ���� �޼ҵ� : �������̽� �̸����� ����(���) ���� -> �������� ������ ��
	static void chageBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�");
	}
	
}
