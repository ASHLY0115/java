/**************************************
 * experiment no : 1
 * Author        : Ashly Rose Antony
 * Date          : 29/11/2021
 * Version       : 1.0
 * *********************************/

package execises;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int flag =0;
	
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System. in);
		
		String input = sc.next();
		System.out.println("The entered string is "+input);
		int length=input.length();
		for(int i=0;i<length;i++) {
			 if(input.charAt(i)!= input.charAt(length-i-1)) {
				 flag=-1;
				 break;
			 }
		}
		
	    
		
	        if (flag == -1) {
	 
	         
	            System.out.print("This is not a palindrome");
	        }
	        else {
	 
	            System.out.print("This is a palindrome");
	        }
	}
}
	    
	
			
			
		

	


