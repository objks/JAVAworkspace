
public class Morning {
	String color = "natural";
	int km = 0;
	int use =0;
	int price = 1000;

	Morning(String color) {
		this.color = color;
	}

	Morning(String color, int price) {
		this.color = color;
		this.price = this.price + price;
	}

	Morning() {
	}

	void showcolor() {
		System.out.println(color);
	}

	void run(int km) {
		this.km += km;
		System.out.println(km);
	}

	int showKm() {
		return km;
	}

	void use(int i) {
		price -= i;
	}

	void nowPrice() {
		System.out.print("감가상각 후 차량가액은 ");
		System.out.println(price-use + "만원 입니다.");
	}
	
	
	
}
