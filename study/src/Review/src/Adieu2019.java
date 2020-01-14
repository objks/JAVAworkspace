
public class Adieu2019 {

	int num1, num2;
	
	Adieu2019(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	Adieu2019() {
		System.out.println("Adieu2019 클래스 값 없이 생성");
	}

	int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	int sum() {
		return num1 + num2;
	}
	
}
