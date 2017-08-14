package algorithm;

import java.util.Random;

public class Basic {
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void show(Comparable[] a) {
		//´òÓ¡Êý×é
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static boolean isSorted(Comparable[] a) {
		for(int i=1;i<a.length;i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	public static void random(Comparable[] a) {
		int length = a.length;
		for(int i=0;i<length;i++) {
			int position = (int)(Math.random()*length);
			exch(a,i,position);
		}
	}
}
