package javaCode;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int x[]= {1,2,3,2,1,4,7,4,2,};
		int a=2;
		int count=0;
		for (int i : x) {
			if (i==a) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
