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
		long startTime=System.nanoTime();   //获取开始时间
		sort(arr); //测试的代码段
		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		assert isSorted(arr);
		show(arr);
	}

}
