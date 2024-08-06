package stringClass;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello",t ="Amar",z="Amar Kumar";
//01:- length() Method>>>>>>>>>>>>>>>>
		System.out.println(s.length()); //5
//02:- charAt() Method>>>>>>>>>>>>>>>>
				System.out.println(s.charAt(0));  //H
				System.out.println(s.charAt(2));  //l
				System.out.println(s.charAt(4));  //o
//03:- toLowerCase() Method>>>>>>>>>>>>>>>>
				System.out.println(s.toLowerCase());	  // hello
//04:- toUpperCase() Method>>>>>>>>>>>>>>>>
				System.out.println(s.toUpperCase());	  // HELLO
//05:- replace() Method>>>>>>>>>>>>>>>>
		System.out.println(s.replace('H', 'C'));	  // Cello
//06:- concat() Method>>>>>>>>>>>>>>>>
		System.out.println(s.concat(t));	  // HelloAmar
		System.out.println(s +t);	  // HelloAmar (Using + Operators)
//07:- trim() Method>>>>>>>>>>>>>>>> (use to Trim both side blank spaces)
		String u ="        Mallick        ";
	System.out.println(u.trim());	  // HelloAmar
//08:- substring() Method>>>>>>>>>>>>>>>>(Starting index starts from 0 & ending index starts from 1)
			System.out.println(s.substring(0, 1));	  // H
			System.out.println(s.substring(0, 4));	  // Hell	
//09:- split() Method>>>>>>>>>>>>>>>> (Split the String in to multiple parts based on Delimiter)
			String v = "Amar-kumar-Mallick";
			 String name[]  =   v.split("-");
			System.out.println(Arrays.toString(name));    // [Amar, kumar, Mallick]
                            //OR
			System.out.println(name[0]);  //Amar
			System.out.println(name[1]);  //Kumar
			System.out.println(name[2]);   //Mallick
//10:- contains() Method>>>>>>>>>>>>>>>> (check the value available in other String or Not)
			System.out.println(z.contains(t)); //true
//11:- equals() Method>>>>>>>>>>>>>>>> (check the value both are same or not, case sensitive also check)
			System.out.println(t.equals("Amar")); //true
			System.out.println(t.equals("amar")); //false
//12:- equalsIgnoreCase() Method>>>>>>>>>>>>>>>> (check the value both are same or not, case sensitive also check)
			System.out.println(t.equalsIgnoreCase("amar")); //true
	}

}
