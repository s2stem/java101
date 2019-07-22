package JavaCourse;

import java.util.Scanner;

public class ClassVariables {
	static int sumab, diffab, prodab, divab, remab;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int vara = scan.nextInt();
		System.out.println("Enter a number: ");
		String str = new String("madam");
		int varb = scan.nextInt();
//		int sumab = vara + varb;
//		int diffab = vara - varb;
//		int prodab = vara * varb;
//		int divab  = vara / varb;
//		int remab  = vara % varb;
		sumab(vara, varb);
		diffab(vara, varb);
		prodab(vara, varb);
		divab(vara, varb);
		remab(vara, varb);
		System.out.println("Sum of Numbers is: "+sumab);
		System.out.println("Diff of Numbers is: "+diffab);
		System.out.println("Prod of Numbers is: "+prodab);
		System.out.println("Div A/B  is: "+divab);
		System.out.println("Remainder a % b is: "+remab);
	}
 public static void sumab(int a, int b)
 {
	 int sum;
	 sumab = a + b;
	 return;
 }
 public static void diffab(int a, int b)
 {
	 int diff;
	 diffab = a - b;
	 return;
 }
 public static void prodab(int a, int b)
 {
	 int prod;
	 prodab = a * b;
	 return;
 }
 public static void divab(int a, int b)
 {
	 int div;
	 divab = a / b;
	 return;
 }
 public static void remab(int a, int b)
 {
	 int rem;
	 remab = a % b;
	 return;
 }

	
}
