package JavaCourse;
import java.util.Scanner;

public class evenorodd {
    static int numa;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		if ( num % 2 == 0)
			System.out.println("Number you entered is even");
		else
			System.out.println("Number you entered is odd");
	}

}
