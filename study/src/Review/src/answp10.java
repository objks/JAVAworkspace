import java.util.Scanner;

public class answp10 {

	public static void main(String[] args) {
		/*
		 * [문제10] 4개의 값을 콘솔에서 입력받아 처리하시오 
		 * 조건) 성별 : M 이면 "남자", 나머지 "여자" (삼항연산자 이용) Input
		 * name: 장미란 Input gender: F Input age: 25 Input tall: 173.3
		 * 
		 * --결과-- 
		 * 이름 : 장미란 성별 : 여자 나이 : 25세 신장 : 173.3cm
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("성별 : ");
		char gender = scan.next().charAt(0);
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println("신장 : ");
		float tall = scan.nextFloat();
		
		
		System.out.println("이름  : " + name);
		System.out.println("성별  : " + ( gender == 'f' ? "여자" : "남자" ));
		System.out.println("나이  : " + age);
		System.out.println("신장  : " + tall);
	}

}
