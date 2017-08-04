package algorithm;
/**希尔排序**/
public class Shell extends Basic{
	public static void sort(Comparable[] a) {
		int length = a.length;
		int maxGap = length/2;	//元素间隔的长度
		for(int h=maxGap;h>=1;h=h/2) {//每个不同长度的h数组按插入排序排好，直至h=1,再进行最后一次插入排序。
			for(int i=h;i<length;i=i+h) {//增量为N的插入排序算法
				for(int j=i;j>0&&less(a[j],a[j-h]);j=j-h) {
					exch(a,j,j-h);
				}
			}
		}
	}
}
