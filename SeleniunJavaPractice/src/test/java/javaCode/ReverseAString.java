package javaCode;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "AmarMallick";
		String rev = " ";
	//Approach-01 (using String length,charAt and concat Method )
		for (int i =s.length()-1; i >=0; i--) {
			
			   rev= rev+s.charAt(i);
		}
		 System.out.println("Reverse String :"+rev);	  
		
	//Approach-02 (Converting String to Char  Array Type )
		 String x = "AmarMallick";
			String r = " ";
			char z[]=x.toCharArray();
			for (int i = z.length-1; i >=0; i--) {
				r= r+z[i];
			}
			System.out.println("Reverse String is :"+r);	
	}

}
