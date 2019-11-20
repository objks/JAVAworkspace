package chap08_interface_definition;

public class Main {

	public static void main(String[] args) {
		Television tv = new Television();
//		tv.MAX_VOLUME = 20;		����� ���� �Ұ���
		tv.turnOn();
		tv.setVolume(10);
		tv.setMute(true);	// ����ó��
		tv.setMute(false);	// ����ó�� ����
		tv.turnOff();
		RemoteControl.chageBattery();// ���� �޼ҵ�
		// Ŭ���� : �ڵ�Ÿ�Ժ�ȯ (�θ�Ŭ���� Ÿ�� = �ڽ�Ŭ���� ��ü)
		// �������̽� : �ڵ�Ÿ�Ժ�ȯ (�������̽� = ����Ŭ���� ��ü)
		RemoteControl rc = new Television();
		rc.setMute(true);
		rc.setVolume(20);
				
//		rc.changeChannel(07);	�Ұ���(Television Ŭ�������� �����߱� ������)
//		rc.channel =8;			�Ұ��� (Ŭ�������� ����)		
		
		// ���� Ÿ�Ժ�ȯ : ���� ������ ��ü��  Television�̹Ƿ� ����
		Television t =(Television)rc;
		t.channel = 9;
		t.changeChannel(14);	// Ŭ�������� ���� ��
		t.setVolume(5);			// �������̽� �߻�޼ҵ� ������
		if(rc instanceof Television) {
			Television t2 = (Television)rc;
		} else if(rc instanceof Aircon) {
			Aircon a = (Aircon) rc;			// �����Ѱ�ó�� ��������
			// ClassCastException ���ܰ� �߻���(���� Television�̱� ������)
		}
		
	}	

}
