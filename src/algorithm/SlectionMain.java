package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlectionMain extends Selection{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] arr= new Integer[10];
		for(int i= 0;i<10;i++) {
			arr[i]=scanner.nextInt();
		}
		sort(arr);
		assert isSorted(arr);
		show(arr);

	}

}
