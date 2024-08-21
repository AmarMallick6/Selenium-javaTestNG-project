package javaCode;

public class FindSmallNumberBetween3Numbers {

	public static void main(String[] args) {
		int a=101,b=202,c=103;
		if (a<b && a<c) {
			     System.out.println("a is small :"+ a);
		}else if (b<a &&b<c) {
			 System.out.println("b is small :"+ b);
		}else if (c<a && c<b) {
			 System.out.println("c is small :"+ c);
		}else {
			System.out.println("All numbers are same");
		}

	}

}
