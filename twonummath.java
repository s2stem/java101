package JavaCourse;
import java.util.Scanner;	

public class twonummath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int vara = scan.nextInt();
		System.out.println("Enter a number: ");
		int varb = scan.nextInt();
//		int sumab = vara + varb;
//		int diffab = vara - varb;
//		int prodab = vara * varb;
//		int divab  = vara / varb;
//		int remab  = vara % varb;
		System.out.println("Sum of Numbers is: "+sumab(vara,varb));
		System.out.println("Diff of Numbers is: "+diffab(vara,varb));
		System.out.println("Prod of Numbers is: "+prodab(vara,varb));
		System.out.println("Div A/B  is: "+divab(vara,varb));
		System.out.println("Remainder a % b is: "+remab(vara,varb));
	}
 public static int sumab(int a, int b)
 {
	 int sum;
	 sum = a + b;
	 return (sum);
 }
 public static int diffab(int a, int b)
 {
	 int diff;
	 diff = a - b;
	 return (diff);
 }
 public static int prodab(int a, int b)
 {
	 int prod;
	 prod = a * b;
	 return (prod);
 }
 public static int divab(int a, int b)
 {
	 int div;
	 div = a / b;
	 return (div);
 }
 public static int remab(int a, int b)
 {
	 int rem;
	 rem = a % b;
	 return (rem);
 }
   
 }
