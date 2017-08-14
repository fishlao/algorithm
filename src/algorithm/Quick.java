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
		//�з�Ԫ������
		while(true) {
			while(less(a[++i],v)) if(i==hi) break;//���Ԫ�ر��з�Ԫ��С��������Ƚϣ�ֱ���ҵ�һ��Ԫ�ر��з�Ԫ�ش�
			while(less(v,a[--j])) if(j==lo) break;//���Ԫ�ر��з�Ԫ�ش�������Ƚϣ�ֱ���ҵ�һ��Ԫ�ر��з�Ԫ��С��
			if(j<=i) break;//����±�һ�������ʾ�зֽ���
			exch(a,i,j);//����任λ��
		}
		exch(a,lo,j);
		return j;
	}

}
