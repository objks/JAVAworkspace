
public class NumUtil {
	static int count;
	int aaa =0;
	static int maxnum(int a, int b) {
		int num=0;
		if (a < b) {
			num = b;
		} else
			num = a;
		return num;
		
	}

	boolean even(int i) {
		if ( i % 2 ==0) {
			return true;					
		} else 		
		return false;
	}

}
