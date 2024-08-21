package javaCode;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
	//Approach-01>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		while (num!=0) {
			 rev=rev* 10+num%10;  
			  num=  num/10;
				}
		System.out.println("Reverse Number is :"+rev);
   //Approach-02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>(String buffer/builder class we can use this method)
		int n=123;
		StringBuffer sb= new StringBuffer();
		sb.append(n);
		StringBuffer r = sb.reverse();
		System.out.println("Reverse Number is :"+r);   //321(output is in String format )
		int reversedNumberToInt = Integer.parseInt(r.toString());
      System.out.println(reversedNumberToInt);   // 321(output is in int format )
    //Approach-03>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>(String buffer/builder class we can use this method)
      int x= 234;
      StringBuilder sb1=new StringBuilder(String.valueOf(x));
      StringBuilder rev1=sb1.reverse();
      System.out.println("Reverse Number is :"+rev1);  //432(output is in String format )
      
	}

}
