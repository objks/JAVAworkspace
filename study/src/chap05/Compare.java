package chap05;

public class Compare {

	public static void main(String[] args) {
		// �⺻ ������ Ÿ�� ����
		// ����, �Ǽ�, ��
		int num=10;	// ���� ��ġ : stack, ���� : ������ �ʱ�ȭ �� ��
		int var1;	// stack�� ���� �����ʰ�
		var1 =20;	// stack�� ����ȴ�.(���� ���ԵǴ� ����)
		if(num==10){	// ������ ����� ���� �� : '=='
			System.out.println(num);
		}
		
		// ���� Ÿ�� ���� : �迭(array), ������(enum), Ŭ����(class), Interface(�������̽�)
		String str="ȫ�浿";		// str : �������� -> stack�� ���� 
				//"ȫ�浿" : �� ������ ����ȴ� -> �ּ�
				// str���� "ȫ�浿"�̶�� string ��ü�� �ּҸ� ����
//				str=null;		// "ȫ�浿" ��ü�� ������ �� �ִ� ����� ������.
				
		String str2="ȫ�浿";		// Heap������ ����� ������ ��ü
		if(str == str2)			//�ּҸ� ��
			System.out.println("������ ��ü�� �����Ѵ�.");
		else
			System.out.println("�ٸ� ��ü�� ����");
		if(str.equals(str2))	// �����
			System.out.println("���� ������ ���� ������");
		else
			System.out.println("�ٸ� ������ ���� ������.");
		System.out.println("str2");
		String str3=null;	// �ƹ��͵� �������� ����
		str3=method1();		// �޼ҵ��� �������� null�� ��ȯ
		if(str3 !=null)
			System.out.println("str3�� ���ڿ��� ���� = "+str3);
		else	// null
			// ���� ó���� �Ѵ�.
			System.out.println("���� �߻�");
		
		if(str.equals(str2)){
			System.out.println("���� ����(��)");
		}
		else{
			System.out.println("�ٸ� ����(��)");
		}
				
	}

}
