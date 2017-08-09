package algorithm;

import java.util.Scanner;

public class BubbleMain extends Bubble{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] arr= new Integer[10];
		for(int i= 0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		long startTime=System.nanoTime(); //获取开始时间
		sort(arr); //测试的代码段
		long endTime=System.nanoTime();; //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		assert isSorted(arr);
		show(arr);
	}
}
