
public class BicycleTest {

	public static void main(String[] args) {
		Bicycle bic1 = new Bicycle();
		Bicycle bic2 = new Bicycle();
		
		bic1.changeCadence(50);
		bic1.speedUp(10);
		bic1.changeGear(2);
		bic1.printStates();
		
		bic2.changeCadence(50);
		bic2.speedUp(10);
		bic2.changeGear(2);
		bic2.changeCadence(40);
		bic2.speedUp(10);
		bic2.changeGear(3);
		bic2.printStates();
	}

}
