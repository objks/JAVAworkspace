
public class NumUtilTest {

	public static void main(String[] args) {
		// static으로 선언을하면 객체를 선언할 필요가 없다.
//		System.out.println(NumUtil.maxnum(9, 2));
		
		NumUtil bbb = new NumUtil();
		bbb.count = 3;
		System.out.println(bbb.count);	// bbb 객체에 들어있는 3
		
		NumUtil aaa = new NumUtil();
		aaa.count = 4;
		System.out.println(aaa.count);	// aaa 객체에 들어있는 4
		System.out.println(bbb.count);	// aaa 객체에 들어있는 3
		System.out.println("_________");	
		
		
		NumUtil num = new NumUtil();
		System.out.println(num.maxnum(6, 9));
		if(num.even(7)) {	// 홀짝을 판단하는 메소드. 리턴값이 true면 짝수
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
			
	}


}
