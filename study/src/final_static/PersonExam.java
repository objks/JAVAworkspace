package final_static;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation= "usa";
		p1.name = "��������";
		int num = p1.MAX_PAGE;
		
		Person p2 = new Person("222222-333333", "ȫ�浿");
		System.out.println(p2.ssn);
	}

}
