import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int newNumber = sc.nextInt();
		System.out.println("the number entered is:"+newNumber);
		sc.close();
		

	}

}
