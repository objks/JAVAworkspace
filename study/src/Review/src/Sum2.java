
public class Sum2 {

	public static void main(String[] args) {
		Add1 add1 = new Add1(2, 3);
		Add1 object1 = new Add1(10, 9);
		
		System.out.println("더하기 : " + add1.sum());
		System.out.println("빼기 : " + object1.sub());	// -2
		object1.println();	// num1값과 num2값이 콘솔에 출력
		
		object1.num1 = 1;
		object1.num2 = 100;
		System.out.println(object1.sum());	// 101
		
		Add1 object2 = new Add1();
		
		System.out.println("오브젝트2 : " + object2.sum());	// 0
		object2.num1=10;
		object2.num2=20;
		System.out.println(object2.sum());	// 30
		System.out.println(object1.sum());	// 101				
	}

}
