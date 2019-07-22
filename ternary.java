package JavaCourse;
import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("enter a number < 10: ");
		num1 = scan.nextInt();
//		if (num1 <5)
//			num2 = 50;
//		else
//			num2 = 100;
//		System.out.println("Num2 is: "+num2);
		num2 = (num1<5)?50:100;
		System.out.println("Num2 is: "+num2);
	}

}
