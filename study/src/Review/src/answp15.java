import java.util.Scanner;

public class answp15 {

	public static void main(String[] args) {
		/*
		 * 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램 난수발생) 1. int a=(int)(Math.random()*100) : 0
		 * - 99 사이의 난수 2. ① import java.util.Random; ② Random 변수1 = new Random(); ③ int
		 * 변수2 = 변수1.nextInt(최대값); ==> 0 ~ (최대값 - 1)사이의 임의의 수
		 */

		int a = (int) (Math.random() * 100);
		int num, count = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("난수를 맞춰보시오");
			System.out.print("숫자 : ");
			num = scan.nextInt();
			count++;
			if (a > num) {
				System.out.println("UP");
			} else if (a < num) {
				System.out.println("DOWN");
			} else
				break;
		}
		System.out.println("ㅊㅋㅊㅋ " + count + "번 만에 맞추었음");
	}

}
