
public class Add1 {
	int num1, num2;
	
	Add1(int num1, int num2) {	// ������
		this.num1 = num1;	
		this.num2 = num2;
	}
	
	Add1() {
		
	}
	
	int sum() {
		return num1 + num2;
	}

	int sub() {
		return num1 - num2;
	}

	void println() {
		System.out.println("num1���� : " + num1);
		System.out.println("num2���� : " + num2);
//		return num1;
	}
	
	
	
}
