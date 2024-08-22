package javaCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number=1221;
		int originalnumber=number;
		int rev=0;
		while (number!=0) {
			rev=rev*10+number%10;
			number=number/10;
			
		}
		  System.out.println("Reverse Number :"+rev);
 //After complete loop condition number value is 0,so we check palindrome compare with original number
         if (originalnumber==rev) {
			System.out.println("It is a palindrome number");
		}else {
			System.out.println("It is not a palindrome number");
		}
	}

}
