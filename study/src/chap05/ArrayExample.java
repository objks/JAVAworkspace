package chap05;

public class ArrayExample {
	
	// C��� int main(void) : �Է� �Ķ���Ͱ� ���� ��
	// 	   int main(int argc, char* argv[])
	// �ڹ� main(String[] args) : String �迭�̹Ƿ� length�� ���� -> int argc
	
	public static void main(String[] args) {
		// C ���
		// int arr[4];
		// �ڹ� : �迭 -> ��ü(Class)-> �ν��Ͻ�ȭ(��ü�� ����): �޸𸮸� �Ҵ�
		int[] arr1 = new int[4]; // new : ��ü�� �����ϱ� ���� �����ڸ� ȣ���ϴ� �뵵
		// arr1 : ���� ����(�ּҸ� ����)
		int[] arr2 = null;
		// arr2[2]=10;
		arr1[2] = 20;
		System.out.println("arr1[2] = " + arr1[2]);

		double darr[] = new double[10]; // �迭�� ����
		for (int i = 0; i < 10; i++) {
			darr[i] = 0.1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("darr[" + i + "] =" + darr[i]);
		}

		String str1 = "ȫ�浿"; // ���� �Ұ� : ���α׷��� �Ϻ�
		String str3 = "ȫ�浿";
		String str2 = new String("ȫ�浿"); // ���� ����
		str2.replace("�̹��", "ȫ�浿");
		System.out.println(str2);

		// C ���
		int nArr[] = { 1, 2, 3, 4, 5 }; // Heap ������ int 5���� �Ҵ��� �ǰ� ���� ��
		int aarr[] = new int[10]; // ��ü �������ϸ� �ʱⰪ���� 0�� ���ڵ� : �����ڿ���
		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i]);
		}
	}
}
