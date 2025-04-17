package in.kunal;


public class Sum_Of_N_Numbers {
	
	public static void main(String[] args) {
		int num = 10;
//		int sum = 0;
//		for(int i = 1 ; i<=num;i++) {
//			sum +=i;
//			System.out.println(sum);
//		}
		
		num = num * (num+1)/2;         //using Nth term formula 
		System.out.println(num);  
	}

}


