public class Math1Test {

	public static void main(String[] args) {
		Math1 math1 = new Math1();
		int sum = math1.allsum(1, 100);
		System.out.println(sum);
		
		Math2 math2 = new Math2();
		System.out.println(math2.allsum(1, 100));
		System.out.println(math2.max(1, 100));	
		
		System.out.println(Math2.max(4, 5));
	}
	
}
