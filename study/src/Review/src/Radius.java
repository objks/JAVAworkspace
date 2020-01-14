import java.util.Scanner;

public class Radius {
	int r;
	double size;
	static final double PI = 3.141592;
	
	Radius() {
		System.out.print("반지름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		scan.close();
	}	
	
	void process() {
		size = r* r * PI; 
	}
	
	void output() {
		System.out.println("원의 넓이 : " + size);
	}
	
}
