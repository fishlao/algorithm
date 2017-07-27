package baseComparable;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Apple> arr = new ArrayList<Apple>();
		Apple apple1 = new Apple("apple1", 1,4);
		Apple apple2 = new Apple("apple2", 2,3);
		
		arr.add(apple1);
		arr.add(apple2);
		System.out.println(arr);
		arr.sort(null);
		System.out.println(arr);

	}

}
