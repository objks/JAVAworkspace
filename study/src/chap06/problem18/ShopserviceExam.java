package chap06.problem18;

public class ShopserviceExam {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �̴�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü �̴�.");
		}
	}

}
