package study03;

public class exer3_8 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;

//		double z = x % y;	// NaN
		double z = x / y;	// Infinite
		
		if(Double.isNaN(z)){	// z�� ���� NaN���� �˻��ϴ� ��ƾ
		System.out.println("0.0���� ���� �� �����ϴ�");
		} else if(Double.isInfinite(z)){	// Infinite �˻�
			System.out.println("0.0���� ���� �� �����ϴ�");
		} else{
			double result = z+10;
			System.out.println("��� : " + result);
		}
	}
}
