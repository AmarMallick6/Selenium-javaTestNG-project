package javaCode;

public class FindGreaterNumber {

	public static void main(String[] args) {
	//Approach-01(using Ternary Operator>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int a=393,b=433;
		int x=(a>b)? a:b;     //result=433(b is big)
      System.out.println(x);
      int m=(a<b)? a:b;     //result=393(b is big)
      System.out.println(m);
      
    //Approach-02(using If-else Condition)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      if (a<b) {
		                      System.out.println("b is big :"+ b);
	} else {
		 System.out.println("a is big :"+ a);
	}
	}

}
