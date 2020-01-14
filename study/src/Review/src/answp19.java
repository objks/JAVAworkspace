public class answp19 {
	static int sum(int i, int j) {
		return i + j;
	}
	
	static int sub(int i, int j) {
		return i - j;
	}
	
	static int mul(int i, int j) {
		return i * j;
	}
	
	static double div(int i, int j) {
		return (double)i / j;
	}
	
	public static void main(String[] args) {
		/*
		 * [문제19] main()함수에서 각각 호출하고 계산된 결과를 return 받아서 main()에서 출력하시오 
		 * 호출함수 : sum(3,5)
		 * sub(7,2) mul(4,5) div(7,3)
		 * 
		 * 더하기 : 8 빼 기 : 5 곱하기 : 20 나누기 : 2.33
		 */
		System.out.println("더하기 : " + sum(3, 5));
		System.out.println("더하기 : " + sub(7, 2));
		System.out.println("더하기 : " + mul(4, 5));
		System.out.println("더하기 : " + String.format("%.2f", div(7, 3)));
	}

	

}
