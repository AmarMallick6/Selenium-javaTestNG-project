package stringClass;

import java.util.Arrays;

public class MutableVSImutable {

	public static void main(String[] args) {
		//Mutable (changing   the original  value directly is possible)
		//Immutable(Direct we can not change the Original value)(String comes under this category)
		//Mutable Example :1>>>>>>>>>>>>>>>>>>>>>
		int a[]= {5,3,2,10,7};
		System.out.println("Before Sorting Value is :"+Arrays.toString(a));
        Arrays.sort(a); //This Method change the  original Array,It's comes under Mutable
        System.out.println("After Sorting Value is :"+Arrays.toString(a));
    	//Mutable Example :2>>>>>>>>>>>>>>>>>>>>>
          StringBuffer sb = new StringBuffer("Amar");
          System.out.println(sb);  //Amar
          sb.append("Kumar");   
          System.out.println(sb); //Amar Kumar
        //Mutable Example :3>>>>>>>>>>>>>>>>>>>>>
          StringBuilder sb1 = new StringBuilder("Amar");
          System.out.println(sb1);  //Amar
          sb.append("Kumar");   
          System.out.println(sb1); //Amar Kumar 
          
    	//Immutable (changing   the value of object directly is not possible) 
        String x= new String("Hello");
        System.out.println(x);
        x.concat("Amar");  //Here it is not change the value after concat operations,output is only Hello 
        System.out.println(x); // Hello
        String xnew = x.concat("Amar"); //  ( using other variable we can change value)
        System.out.println(xnew); // HelloAmar
      
       
       
        
      
        
	}

}
