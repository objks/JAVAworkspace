
public class ClassExTest1 {

	public static void main(String[] args) {
		ClassEx1 pt= new ClassEx1("홍길동", 23, "경기도 수원시");
			
		String Name =pt.Name;
		int Age=pt.Age;
		String Address=pt.Address;
		
		System.out.println("이름은 " + Name);
		System.out.println("나이는 : " + Age);
		System.out.println("주소 : " + Address);
	}
}
