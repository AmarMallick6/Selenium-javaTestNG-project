package javaCode;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		//Sort Array Using Build In Method>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int a[] = {2,3,4,1,5,7};
		System.out.println("Before Sorting :" + Arrays.toString(a));  //Before Sorting :[2, 3, 4, 1, 5, 7]
        Arrays.sort(a);
        System.err.println("After Sorting :" + Arrays.toString(a)); // After Sorting :[1, 2, 3, 4, 5, 7]
	}

}
