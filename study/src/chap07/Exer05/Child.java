package chap07.Exer05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);			// �θ� Parent�� ����Ʈ �����ڸ� ȣ��
		this.name = name;
		this.studentNo = studentNo;
	}

}
