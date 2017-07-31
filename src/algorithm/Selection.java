package algorithm;

/**选择排序**/
public class Selection extends Basic {
	public static void sort(Comparable[] a) {
		// 获取数组长度
		int N = a.length;
		for (int i = 0; i < N; i++) {
			// 假设剩下的数组的第一个元素为最小值
			int min = i;
			// 比较找出剩下最小的元素，当下标为N-1，即最后一个数时则不用再比较，此时顺序已确定，也不会再进入此循环
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			// 将元素交换
			exch(a, min, i);
		}
	}
}
