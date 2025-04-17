package in.kunal;

public class prime_Num {
	
	public static void main(String[] args) {
		
		int upper = 20 ;
		int lower = 1;
		
	    for(int i = lower; i<=upper ;i++) {
	    	if(isPrime(i)) 
	    		System.out.print(i + " ");
	    	 
	    }
		
	}
	
	static boolean isPrime( int n ) {
		
		if(n<2) 
			return false;
		
		for(int i = 2 ; i<=n;i++) {
			if(i%n==0) {
				return true;
			}
		}
		
		return false;
		
	}

}
