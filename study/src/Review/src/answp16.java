
public class answp16 {

	public static void main(String[] args) {
		/* 1~100�����Ǽ� �߿���  3�� ����̸鼭 7�� ��� ���ϱ� 
      ����) for���� && �����ڸ� �ݵ�� �̿� */
		
		for(int i=1; i < 100; i++) {
			if(i % 3 == 0 && i % 7 ==0) {
				System.out.println(i);
			}
		}
	}

}
