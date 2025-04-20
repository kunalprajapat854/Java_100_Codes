package in.kunal;

public class prime_Num {
	
	
	public static void main(String[] args) {
		int n  =  	28;
		checkprime(n);
		
	}
	
	private static void checkprime(int n) {
		int count = 0;
		if(n<2) {
			System.out.println("The given num is not prime " + n);
			System.exit(0);
		}
		
		for(int i = 1 ;i<=n;i++) {
			if(n%i==0) 
				count+=1;
			
		}
		
		if(count >2) 
			System.out.println("the given num is not prime "  + n);
		else 
			System.out.println("Prime num " + n);
	}

}
