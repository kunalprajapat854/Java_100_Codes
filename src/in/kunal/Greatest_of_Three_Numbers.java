package in.kunal;

public class Greatest_of_Three_Numbers {
	
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		int c = 50 ;
		
		
		//these variable used in ternary operator approach.
		int temp ,result;
		 
		
		//using loop and && operator
//		if (a>=b  && a>=c) 
//			System.out.println(a);
//		 else if (b>=a && b>=c) 
//			System.out.println(b);
//		 else if (c>=b && c>=a)
//			 System.out.println(c);
		
		
		//using ternary operator and temp variable 
		temp = a > b ? a:b;
		result = temp > c ? temp:c;
		
		System.out.println("Gretest of three number is " + result);
	}

}
