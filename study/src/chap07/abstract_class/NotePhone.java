package chap07.abstract_class;

public class NotePhone extends Phone {
	// 생성자
	public NotePhone(String owner) {
		super(owner);	// super : 부모 (Phone)
	}
	
	// 메소드
	public void internetSearch(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	// 부모가 정의한 turnOff() 메소드 : 재정의를 하지 않음
	// sendMessage : 추상메소드는 강제로 재정의를 해주어야 함
	@Override
	public void sendMessage(String message) {
		System.out.println(message + "을 전송합니다.");
	}
	
}
