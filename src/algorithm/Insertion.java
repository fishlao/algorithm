package algorithm;

/**��������**/
public class Insertion extends Basic{
	public static void sort(Comparable[] a) {
		// ��ȡ���鳤��
		int N = a.length;
		for(int i=0;i<N;i++) {
			for(int j=i;j>0&&less(a[j],a[j-1]);j--) {
				exch(a,j,j-1);
			}
		}
	}
}
