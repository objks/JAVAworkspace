package chap11.api;

public class MainExample {

	public static void main(String[] args) {
		String str = "I have a dream";
		// charAt : �ѹ��ھ� ���� ��� ���� (index ��ġ)
		for(int i = 0;i < str.length();i++) {
			System.out.println(str.charAt(i));
		}
		int position = str.indexOf("have");
		System.out.println("have �� ��ġ = " + position);	// 2
		if(str.startsWith("I")) {
			System.out.println("�� ���ڿ��� I�� �����ϴ� ���ڿ���");
		} else {
			System.out.println("�� ���ڿ��� I�� �����ϴ� ���ڿ��� �ƴ�");
		}
		if(str.contains("has")) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		System.out.println(str.hashCode());
		String str2 = str.replace("have", "has");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
				
	}

}
