
public class ClassExTest2 {

	public static void main(String[] args) {
		ClassEx2 pt= new ClassEx2();
		
		// 초기화
		pt.setName("홍길동");
		pt.setAge(27);
		pt.setAddress("경기도 수원시");
		
		// 값 가져오기			
		String Name =pt.getName();
		int Age=pt.getAge();
		String Address=pt.getAddress();
		
		// 결과 뷰
		System.out.println("이름은 " + Name);
		System.out.println("나이는 : " + Age);
		System.out.println("주소 : " + Address);
	}
}
