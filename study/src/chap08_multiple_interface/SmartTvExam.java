package chap08_multiple_interface;

public class SmartTvExam {

	public static void main(String[] args) {
		SmartTv st = new SmartTv();
		SmartTv rc = new SmartTv();
		rc.turnOn();
		rc.setVolume(20);
//		rc.search();	�Ұ��� (RemoteControl Ÿ��)
		Searchable s = (Searchable)rc;	// ���� ������ ���� SmartTv�̹Ƿ�
		s.search("https://www.naver.com");
		rc.turnOff();
	}

}
