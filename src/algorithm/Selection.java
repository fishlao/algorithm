package algorithm;

/**ѡ������**/
public class Selection extends Basic {
	public static void sort(Comparable[] a) {
		// ��ȡ���鳤��
		int N = a.length;
		for (int i = 0; i < N; i++) {
			// ����ʣ�µ�����ĵ�һ��Ԫ��Ϊ��Сֵ
			int min = i;
			// �Ƚ��ҳ�ʣ����С��Ԫ�أ����±�ΪN-1�������һ����ʱ�����ٱȽϣ���ʱ˳����ȷ����Ҳ�����ٽ����ѭ��
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			// ��Ԫ�ؽ���
			exch(a, min, i);
		}
	}
}
