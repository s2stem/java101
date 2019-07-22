package JavaCourse;
import java.util.Scanner;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = new String();
		int strlen;
		System.out.println("Enter a Word: ");
		str1 = scan.nextLine();
	    System.out.println("The word you entered is: "+str1);
	    strlen = str1.length();
	    System.out.println("The number of characters in your word are: "+strlen);
	}

}
