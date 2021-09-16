package arraysExample;

import java.util.ArrayList;
import java.util.List;

public class StoringValueInToArrays {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();

		li.add("one");
		li.add("two");
		li.add("three");

		for (int x = 0; x < li.size(); x = x + 1) {
			System.out.println(li.get(x));
		}

//		int x=100;
//		String[] arr = new String[4];
//
//		arr[0] = "one";// 0
//		arr[1] = "two";// 1
//		arr[2] = "three";// 2
//		arr[3] = "four";// 3
//
//		
//		
//		
//
//		for (int x = 0; x < arr.length; x = x + 1) {
//			System.out.println(arr[x]);
//
//		}

	}

}
