package ch2;

public class ForFor {

	public static void main(String[] args) {
		// 주사위 두 개를 던져서 7이 되는 경우의 수를 모두 출력하시오
		for(int i=1; i <7; i++) {
			for(int j=1; j < 7; j++) {
				if(i+j==7) {
				System.out.print(i + "," );
				System.out.println(j);
				}
			}
		}
	}

}
