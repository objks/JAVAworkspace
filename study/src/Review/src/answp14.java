import java.util.Random;

public class answp14 {

	public static void main(String[] args) {
		int rand;
		int sum = 0;
		
		for(int i = 0; i < 50; i++) {
			rand = new Random().nextInt(101);
			System.out.print(rand + "\t");			
			sum = sum + rand;
			
			if(i % 6 ==0) {
				System.out.println();
			}
		}
		System.out.println("\nÇÕ : " + sum);
	}

}
