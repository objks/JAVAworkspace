package chap08.polymorphism;

import chap08_interface_usage.RemoteControl;
import chap08_interface_usage.SettopBox;
import chap08_interface_usage.Television;

public class IntsanceofExam {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ
		RemoteControl rc = new SettopBox();	// �������̽� Ÿ�� �����̸� = new
//		rc.setVolume= 10;	 ���� ��ü���� ������ �ʵ�
		// ����Ÿ�Ժ�ȯ
		SettopBox sb = (SettopBox)rc;
		if(rc instanceof Television) {
			Television tv = (Television)rc;		// ���� -> Error(ClassCastExcption �߻�)
		} else if(rc instanceof SettopBox) {
			SettopBox s2 = (SettopBox)rc;
		}
	
	}

}
