
public class SingleStudentTest {

	public static void main(String[] args) {
		SingleStudent shion1 = SingleStudent.getInstance();
		SingleStudent shion2 = SingleStudent.getInstance();
		
		if(shion1.equals(shion2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
