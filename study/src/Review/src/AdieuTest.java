
public class AdieuTest {

	public static void main(String[] args) {
		Adieu2019 adieu2019 = new Adieu2019(5, 6);
		
		System.out.println(adieu2019.sum(7, 8));	// 15
		
		System.out.println(adieu2019.sum());	// 11
		
		Adieu2019 obj1 = new Adieu2019();	// Ãâ·Â ¸àÆ®
		System.out.println(obj1.sum());		// 0
		
		Adieu2019_2 adieu2019_2 = new Adieu2019_2();
		System.out.println(adieu2019_2.sum(7, 8));
		System.out.println(adieu2019_2.sub(8, 5));
		System.out.println();
	}

}
