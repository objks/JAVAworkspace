public class answp19 {
	static int sum(int i, int j) {
		return i + j;
	}
	
	static int sub(int i, int j) {
		return i - j;
	}
	
	static int mul(int i, int j) {
		return i * j;
	}
	
	static double div(int i, int j) {
		return (double)i / j;
	}
	
	public static void main(String[] args) {
		/*
		 * [����19] main()�Լ����� ���� ȣ���ϰ� ���� ����� return �޾Ƽ� main()���� ����Ͻÿ� 
		 * ȣ���Լ� : sum(3,5)
		 * sub(7,2) mul(4,5) div(7,3)
		 * 
		 * ���ϱ� : 8 �� �� : 5 ���ϱ� : 20 ������ : 2.33
		 */
		System.out.println("���ϱ� : " + sum(3, 5));
		System.out.println("���ϱ� : " + sub(7, 2));
		System.out.println("���ϱ� : " + mul(4, 5));
		System.out.println("���ϱ� : " + String.format("%.2f", div(7, 3)));
	}

	

}
