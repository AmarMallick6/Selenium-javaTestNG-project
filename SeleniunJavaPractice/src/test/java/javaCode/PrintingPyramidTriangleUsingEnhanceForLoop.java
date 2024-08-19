package javaCode;

public class PrintingPyramidTriangleUsingEnhanceForLoop {

	public static void main(String[] args) {
		int k=1;
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4-i; j++) {
				System.out.print(k+"\t");
				k++;
				
			}System.out.println("");
			
		}
	// Output of the above code...............................	
//		1	2	3	4	
//		5	6	7	
//		8	9	
//		10	
		
	}

}
