
public class Math1 {

	int allsum(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
			sum += i;
			}
		}
		return sum;
	}
}
