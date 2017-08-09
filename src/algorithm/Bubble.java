package algorithm;
//ц╟ещеепР
public class Bubble extends Basic{
	public static void sort(Comparable[] a) {
		int length = a.length;
		for(int i=0;i<length;i++) {
			for(int j=1;j<(length-i);j++) {
				if(less(a[j],a[j-1]))
				exch(a,j,j-1);
			}
		}
	}
}
