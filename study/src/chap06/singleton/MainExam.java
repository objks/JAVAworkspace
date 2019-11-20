package chap06.singleton;

import java.util.Calendar;

public class MainExam {

	public static void main(String[] args) {
//		SingleTon s = new SingleTon();	// ��ü�� ���� �Ұ�
		SingleTon s1 = SingleTon.getInstance();
		s1.data[0] = 10;
		
		// �ð�
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		CommonStroage s3 = CommonStroage.getIn();
		System.out.println(s3.data);
	}

}
