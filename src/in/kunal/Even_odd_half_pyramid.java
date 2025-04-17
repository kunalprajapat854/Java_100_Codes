package in.kunal;

public class Even_odd_half_pyramid {
	
	public static void main(String[] args) {
		int n = 4;
		
		for(int i = 1 ;i<=n;i++) {
			for(int j = 1 ;j<=i;j++) {
				int cell = i+j;
				if(cell%2==0) 
					System.out.print("1" + "");
				 else 
					System.out.print("0" + "");
				
				System.out.println();
			}
		}
	}
}