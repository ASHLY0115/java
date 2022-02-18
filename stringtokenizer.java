package test2;

import java.util.StringTokenizer;  
import java.util.Scanner;

public class stringtokenizer{  
	
 public static void main(String args[]){  
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the string");
	 String string = sc.nextLine();
     StringTokenizer st = new StringTokenizer(string," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  