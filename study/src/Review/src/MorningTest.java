
public class MorningTest {

	public static void main(String[] args) {
		Morning mor = new Morning();
		System.out.println("모닝 컬러 : " + mor.color);
		mor.showcolor();
		mor.color = "레드";
		mor.showcolor();
		
		Morning lysCar = new Morning("레인보우", 1800);	// 색상과 옵션가격 입력
		lysCar.showcolor();	// 레인보우
		lysCar.run(100);
		lysCar.run(400);
		lysCar.run(350);
		System.out.println("임윤식 : " + lysCar.showKm());	// 현재까지 주행거리 찍힘
												// 850
		lysCar.use(100);		// 감가삼각비용  현재가치 1000이었으면 900 
		lysCar.nowPrice();		// 차의 
		
		Morning yhiCar =new Morning("화이트펄");
		yhiCar.showcolor();
		yhiCar.run(1);
		System.out.println("양현일 : " + yhiCar.showKm());
	}

}
