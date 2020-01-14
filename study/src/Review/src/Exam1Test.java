
public class Exam1Test {

	public static void main(String[] args) {
		// 65430원을 만들기 위한 화폐의 갯수를 구하시오.
		
		int money = 65430;
		
		int a = money / 10000;
		int b  = (money - (a * 10000)) / 1000;

		int c = money / 100;
		int d = money / 10;
		
		System.out.println("만원 " + a);
		System.out.println("천원 " + b);
		System.out.println("백원 " + c);
		System.out.println("십원 " + d);
	}

}
