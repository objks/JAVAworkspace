package study03;

public class exer3_3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// �л� �Ѹ��� ������ ���� ��
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		// ���� ���� �� 
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
	}

}
