package algorithm;

import java.util.Scanner;

public class BubbleMain extends Bubble{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] arr= new Integer[10];
		for(int i= 0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		long startTime=System.nanoTime(); //��ȡ��ʼʱ��
		sort(arr); //���ԵĴ����
		long endTime=System.nanoTime();; //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
		assert isSorted(arr);
		show(arr);
	}
}
