package algorithm;

import java.util.Random;
import java.util.Scanner;

public class QuickMain extends Quick{

	public static void main(String[] args) {
		Integer[] arr= new Integer[50];
		Random random = new Random();
		for(int i= 0;i<50;i++) {
			arr[i]=random.nextInt(50);
		}
		long startTime=System.nanoTime();   //��ȡ��ʼʱ��
		sort(arr); //���ԵĴ����
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
		assert isSorted(arr);
		show(arr);
	}

}
