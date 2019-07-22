package JavaCourse;
import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		char vara = scan.next().charAt(0);
		switch (vara) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("It is a vowel");
				break;
			default:
				System.out.println("It is a consonant");
		}
	}

}
