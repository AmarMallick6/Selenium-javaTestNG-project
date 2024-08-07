package javaCode;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name :");
		String s=sc.next();
		String org_name = s;
		String rev_name ="";
		for (int i = org_name.length()-1; i >=0; i--) {
			rev_name=rev_name+org_name.charAt(i);
		}
       
       if(org_name.equals(rev_name)) {
    	   System.out.println(org_name+"Name is Polindrome String");
       }else {
    	   System.out.println(org_name+"Name is Not  Polindrome String");
	}
	}

}
