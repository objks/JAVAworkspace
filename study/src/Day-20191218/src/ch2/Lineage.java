package ch2;

import java.util.Random;
import java.util.Scanner;

public class Lineage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		for (;;) {
			int box = ran.nextInt(20) + 1; // 5% 확률
			System.out.println("20개의 박스 중 하나를 선택해주세요");
			int user = scan.nextInt();
			if (box == user) {
				System.out.println("축하합니다~! 검을 뽑았습니다");
				break;
			} else {
				System.out.println("다시 뽑아보세요");
				System.out.println(box);
			}
		}

		int strong = 0; // 강화값
		int count = 0; // 강화 횟수
		int drng = 1;
		do {
			count++;
			System.out.println("강화하시겠습니까?");
			System.out.println("1. YES 2. NO");
			int input = scan.nextInt();
			if (input == 2) {
				System.out.println("최종 결과물은 " + strong + "입니다.");
				break;
			}
			// 강화 요청시 강화해보기
			int check1 = ran.nextInt(2 * drng); // 최초 50% 확률 - 뽑은값
			int check2 = 1; // 확인값
			drng = drng * 2; // 확률이 반으로 줄어듬
			if (check1 == check2) {
				strong++;
				System.out.println("강화 성공~!!!! 집행검 (" + strong + ")");
			} else {
				System.out.println("강화실패! 집행검이 부러졌습니다.");
				break;
			}
		} while (count != 10); // 최대 10강화
		System.out.println("끝");
	}
}
