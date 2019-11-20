package chap09.nested_class;

import java.lang.reflect.Method;

import org.omg.CORBA.PUBLIC_MEMBER;

public class OuterClass {
	// ��� : �ʵ�, ������, �޼ҵ�
	int num;
	ComThread thread1 = new ComThread();

	// ������
	public OuterClass() {

	}

	public void method3(String url) {
		ComThread thread = new ComThread();
		method(thread);
	}

	// �޼ҵ�
	public void method(ComThread thread) {
		thread.start(); // �����带 ���� -> run()�� �����
	}

	public void method2() {
		ComThread thread = new ComThread();
		thread.start();
	}

	// �ν���Ʈ ��� Ŭ���� : ��ø Ŭ����
	public class ComThread extends Thread {
		// ������ ����Ǵ� �κ�
		@Override
		public void run() {
			int count = 0;
			// ����κ�
			for (int i = 0; i < 10; i++) {
				System.out.println("count : " + count++);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// ���� ��� Ŭ����
	public static class ServerThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("������ ��� �� : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
