
public class NumUtilTest {

	public static void main(String[] args) {
		// static���� �������ϸ� ��ü�� ������ �ʿ䰡 ����.
//		System.out.println(NumUtil.maxnum(9, 2));
		
		NumUtil bbb = new NumUtil();
		bbb.count = 3;
		System.out.println(bbb.count);	// bbb ��ü�� ����ִ� 3
		
		NumUtil aaa = new NumUtil();
		aaa.count = 4;
		System.out.println(aaa.count);	// aaa ��ü�� ����ִ� 4
		System.out.println(bbb.count);	// aaa ��ü�� ����ִ� 3
		System.out.println("_________");	
		
		
		NumUtil num = new NumUtil();
		System.out.println(num.maxnum(6, 9));
		if(num.even(7)) {	// Ȧ¦�� �Ǵ��ϴ� �޼ҵ�. ���ϰ��� true�� ¦��
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
			
	}


}
