
public class AllAdd {
	int num1, num2;
	
	AllAdd(int a, int b) {
		System.out.println("���ο� ��ü ����");
		num1 = a;
		num2 = b;
	}
	
	int sum() {		
		int sum = 0;
		for(int i=num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

	
}
