package chap08_annoymous;

// public�� �����ϴ��� public interface�� ����.
public interface RemoteControl {
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	// public static final�� ������ ����
	public static final int CONSTANT_VALUE=10;
	
	// �޼ҵ� : �߻�, default, ����
	void turnOn();		// �߻�޼ҵ�
	void turnOff();
	void setVolume(int volume);
	
	// default �޼ҵ� -> ����κ��� �ִ�
	default void setMute(boolean mute) {
		if(mute) { 
			System.out.println("���� ó��");
		} else {
			System.out.println("���� ����");
		}
	}
	
	// ���� �޼ҵ�
	static void changeBattery() {
		
	}
}
