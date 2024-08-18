package javaCode;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String a = "Amar       Kumar         Mallick";
	 String s = a.replaceAll("\\s", "");
	 System.out.println(s);

	}

}
