package ch3;

public class FunctionTest {

	public static void main(String[] args) {
		int a = 5, b = 7;
		int value = add(3, 5);
		System.out.println(value);

		starPrint(5);

		// n~m���� ���� ������ִ� �Լ�
		int aaa = sum(10, 1);
		System.out.println(aaa);

		// Ȧ¦�� �Ǵ��ϴ� �Լ� : ���� 0�̸� Ȧ��, 1�̸� ¦��
		int f = checkOdd(17);
		if (f == 0)
			System.out.println("Ȧ��");
		else
			System.out.println("¦��");
	}

	private static int checkOdd(int number) {
		if (number % 2 == 0)
			return 1;
		else
			return 2;
	}

	private static int sum(int i, int j) {
		if (i > j) {
			int c = i;
			i = j;
			j = c;
		}
		int sum = 0;
		for (int a = i; a <= j; a++) {
			sum += a;
		}
		return sum;
	}

	private static void starPrint(int i) {
		for (int j = 0; j < 5; j++) {
			System.out.print("*");
		}
	}

	static int add(int a, int b) {
		a = a - 5;
		int sum;
		sum = a + b;
		return sum;
	}

}
