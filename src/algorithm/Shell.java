package algorithm;
/**ϣ������**/
public class Shell extends Basic{
	public static void sort(Comparable[] a) {
		int length = a.length;
		int maxGap = length/2;	//Ԫ�ؼ���ĳ���
		for(int h=maxGap;h>=1;h=h/2) {//ÿ����ͬ���ȵ�h���鰴���������źã�ֱ��h=1,�ٽ������һ�β�������
			for(int i=h;i<length;i=i+h) {//����ΪN�Ĳ��������㷨
				for(int j=i;j>0&&less(a[j],a[j-h]);j=j-h) {
					exch(a,j,j-h);
				}
			}
		}
	}
}
