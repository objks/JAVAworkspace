import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		System.out.print("달을 입력하시오 ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch (month) {
		case 1:
			month = 1;
			System.out.println("1월");
			break;
		case 2:
			month = 2;
			System.out.println("2월");
			break;
		case 3:
			month = 3;
			System.out.println("3월");
			break;
		case 4:
			month = 4;
			System.out.println("4월");
			break;
		case 5:
			month = 5;
			System.out.println("5월");
			break;
		case 6:
			month = 6;
			System.out.println("6월");
			break;
		case 7:
			month = 7;
			System.out.println("7월");
			break;
		case 8:
			month = 8;
			System.out.println("8월");
			break;
		case 9:
			month = 9;
			System.out.println("9월");
			break;
		case 10:
			month = 10;
			System.out.println("10월");
			break;
		case 11:
			month = 11;
			System.out.println("11월");
			break;
		case 12:
			month = 12;
			System.out.println("12월");
			break;
		default:
			break;
		}
	}
}
