
public class Adieu2019_2 extends Adieu2019 {

	Adieu2019_2() {		
		super(2, 3);
	}
	
	int sub(int num1, int num2) {
		super.num1 = num1;
		super.num2 = num2;		
		return num1 - num2;
	}
	
	// 상위 클래스의 메소드를 재정의해서 사용 - 오버라이딩
	int sum(int num1, int num2) {
		return num1 * num2;		
	}
	
}
