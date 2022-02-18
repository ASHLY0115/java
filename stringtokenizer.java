/****************************************
 * file    : string tokenizer
 * authors : AshNav
 ******************************************/



package test2;

import java.util.StringTokenizer;  
import java.util.Scanner;

public class stringtokenizer{  
	
 public static void main(String args[]){  
	 int count=0;
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the string");
	 String string = sc.nextLine();
	 
     StringTokenizer st = new StringTokenizer(string," "); 
     
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
         count = count+1;
         
     }     
     System.out.println("no of counts"+ count);
   }  
}  