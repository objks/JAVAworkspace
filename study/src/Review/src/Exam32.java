
public class Exam32 {

	Exam32(int i, int j) {
		if (i < j) {
			System.out.println("max : " + j);
		} else
			System.out.println("max : " + i);
	}
	
	Exam32(double f, double g) {
		if(f < g) {
			System.out.println("max : " + g);
		} else
			System.out.println("max : " +f);
	}

	Exam32(char c, char d) {
		if( c < d ) {
			System.out.println("max : " + d);
		} else 
			System.out.println("max : " + c);
	}
	
}
