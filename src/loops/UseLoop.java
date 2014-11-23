package loops;

import java.util.Scanner;

public class UseLoop {
			
	public static void main(String[] args) {
		/* Write a for loop to store numbers into an Array, Then use another for loop to retrieve 
		 *  the numbers from the Array and print to console.
		 *
		 *  Hints: Use Scanner class with System.in constructor to get input from keyboard.
		 *
		 *
		 *
		 */
		
		int [] number = new int[10];
		Scanner scan = new Scanner(System.in);
System.out.println("Enter 10 numbers: ");
for(int i = 0; i< number.length; i++){
number[i]=scan.nextInt();

}
System.out.println("The numbers are " );
for(int j=0;j<number.length; j++)
{
	System.out.print(number[j] + ",");
}
}
}

