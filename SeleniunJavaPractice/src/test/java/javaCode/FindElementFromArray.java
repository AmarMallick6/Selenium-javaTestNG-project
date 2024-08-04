package javaCode;

public class FindElementFromArray {

	public static void main(String[] args) {
		int x[]= {25,30,45,34,22,13,24};
		int search_element=13;
		
		boolean status=false;
	//using For Loop>>>>>>>>>>>>>>>>>>>>>>>>>>>
		for (int i = 0; i < x.length; i++) {
			if (x[i]==search_element) {
				System.out.println("Element is found");
				status= true;
				break;
			}
		}
		if (status==false) {
			System.out.println("Element is not found");
		}
		
 //using For Each Loop>>>>>>>>>>>>>>>>>>>>>>>>>>>
				for (int ele:x) {
					if (ele==22) {
						System.out.println("Element is found");
						status= true;
						break;
					}
				}
				if (status==false) {
					System.out.println("Element is not found");
				}
				
	}

}
