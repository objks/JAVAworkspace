
public class answp18 {

	public static void main(String[] args) {
		int k;

		for (int i = -4; i <= 4; i++) {
			k = i < 0 ? -i : i;
			for (int j = k; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 9 - 2 * k; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("     ");
			}
			System.out.println("*");
		}
		System.out.println();
	}

}
