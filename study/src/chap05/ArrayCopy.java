package chap05;
/*
 * �迭 ���� : �ѹ� ũ�⸦ ���ؼ� ������ �ϸ� ũ�Ⱑ ����
 * �����͸� �� �����ϰ� ���� ��� ���ο� ũ���� �迭�� ����
 * ������ �����  �����͸� ���� -> ����
 * System.arraycopy
 * */
public class ArrayCopy {

	public static void main(String[] args) {
		int arr1[] ={2,4,6,8};	// ���� 4
		int arr2[] = new int[10];
		// ���� : ���� �����͸� ����
		
		/*// �ݺ����� ����ؼ� ����
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i]
		}
		arr2[4]=10;
		*/
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		arr2[4]=10;
		for(int i=1;i<arr2.length;i++){
			System.out.println("arr2[" + i + "]=" + arr2[i]); 
		}
	}
}
