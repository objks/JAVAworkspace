package chap06.problem15;

public class MemberService {
	// �޼ҵ�
	boolean login(String id, String psword) {
		// ���ǹ� == �ּ� ��, equals ���� ��
		if (id.equals("hong") && psword.equals("12345")) 
			return true;
		else 
			return false;			
	}
	
	void logout(String id) {
		// "�α׾ƿ� �Ǿ����ϴ�" ���
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
