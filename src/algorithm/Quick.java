package algorithm;

public class Quick extends Basic{
	public static void sort(Comparable[] a) {
		random(a);
		sort(a,0,a.length-1);
	}
	
	private static void sort(Comparable[] a,int lo, int hi) {
		if(hi<=lo) return;
		int j = partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
		
	}
	
	private static int partition(Comparable[] a,int lo, int hi) {
		int i = lo;
		int j = hi+1;
		Comparable v = a[lo];
		//切分元素排序
		while(true) {
			while(less(a[++i],v)) if(i==hi) break;//如果元素比切分元素小，则继续比较，直至找到一个元素比切分元素大。
			while(less(v,a[--j])) if(j==lo) break;//如果元素比切分元素大，则继续比较，直至找到一个元素比切分元素小，
			if(j<=i) break;//如果下标一样，则标示切分结束
			exch(a,i,j);//否则变换位置
		}
		exch(a,lo,j);
		return j;
	}

}
