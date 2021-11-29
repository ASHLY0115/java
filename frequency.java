package execises;
import java.util.Scanner;
public class frequency {



   public static void main(String args[]){
      System.out.println("Enter a string  :");
      Scanner sc = new Scanner(System.in);
      String str = sc.next();

      System.out.println("Enter a  character :");
      char ch = sc.next().charAt(0);
      int count = 0;

      for (int i=0; i<str.length(); i++){
         if(ch == str.charAt(i)){
            count++;
         }
      }
      System.out.println("Frequency of the given character: "+count);
   }
}
