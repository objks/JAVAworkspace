package chap06;

public class Person {
	// �ʵ�
	String name;
	String ssn;
	String birthday;
	
	double height = 10.0;
	double weight = 2.5;
	
	public Person() {
		System.out.println("Ű : " + height);
		height = 20.0;
		System.out.println("Ű2 : " + height);
	}
	
	// ��ǰ
	int head;
	int arm;
	int foot;
	
	// ����
	Car myCar;
}
