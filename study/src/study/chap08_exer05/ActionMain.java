package study.chap08_exer05;

public class ActionMain {

	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}			
		}; action.work();
	}

}
