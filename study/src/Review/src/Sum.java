
public class Sum {

	public static void main(String[] args) {
		
		AllAdd o_allAdd = new AllAdd(1, 100);
		AllAdd o_allAdd1 = new AllAdd(1, 10);
		
		System.out.println(o_allAdd.sum());
		System.out.println(o_allAdd1.sum());
		System.out.println();
		

//		int sum = o_allAdd.sum(1,100);
//		System.out.println("Ŭ���� " + sum);
		
		
		// 1 ~ 100���� ���� ����ϴ� ���α׷�
		int sum2=0;		
		for(int i=0; i <= 100; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		System.out.println("�Լ� " + sum(1,100));
	}
	// 1 ~ 100���� ���ϴ� �Լ�
	static int sum(int a, int b) {
		int sum=0;		
		for(int i=a; i <= b; i++) {
			sum += i;
		}		
		return sum;
	}

}
