package in.kunal;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year" );
		int year = sc.nextInt();

		if (year %400 == 0 ||( year %4 == 0 && year %100 != 0)) 
			System.out.println("Leap Year " +  year);
		 else 
			System.out.println("Not a leap year " + year);
		
	}
}
