package chap06.singleton;
/*
 * �̱���(SingleTon) : ��ü�� �ϳ��� ����
 * � �����͸� �ѱ������� ������ �Ѵ�.
 * ��ü�� ������ ����� �������� ����ġ -> ��ü�� �ϳ��� �����ϰ� �ʹ�.
 * 
 */
public class SingleTon {
	// 1. ���� �ʵ� instance
	private static SingleTon instance = new SingleTon();	// private : �ڽ��� Ŭ���������� ���� ����
	
	// 2. private ������ ����
	private SingleTon() { } // ������
	
	// ��ü�� ������ �� �ִ� �ּҸ� ���� �� �ִ� �޼ҵ带 ����
	public static SingleTon getInstance() {
		return instance;
	}
	
	int data[] = new int[10];
}
