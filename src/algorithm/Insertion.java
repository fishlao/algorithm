package algorithm;

/**插入排序**/
public class Insertion extends Basic{
	public static void sort(Comparable[] a) {
		// 获取数组长度
		int N = a.length;
		for(int i=0;i<N;i++) {
			for(int j=i;j>0&&less(a[j],a[j-1]);j--) {
				exch(a,j,j-1);
			}
		}
	}
}
