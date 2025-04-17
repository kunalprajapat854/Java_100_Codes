package in.kunal;
import java.util.Scanner;
public class Loop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int n  = sc.nextInt();
        int i = 1 ;
        
        int max = 0;
         while(i<=n) {
        	i++;
         }
         System.out.print(i + " ");
	}

}
