package JavaCourse;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String pword = new String();
		int lv_word_len, ctr;
		boolean lv_word_is_palindrome = true;
		System.out.println("Enter a Word: ");
		pword = scan.nextLine();
		lv_word_len = pword.length() - 1;
		ctr=0;
		
		do {
			if (pword.charAt(ctr) != pword.charAt(lv_word_len))
			{
				System.out.println("Word is NOT a Palindrome");
				lv_word_is_palindrome = false;
				break;
			}
			lv_word_len--;
			ctr++;
		} while (lv_word_len <= ctr);
		if ( lv_word_is_palindrome == true)
			System.out.println("Word is a Palindrome");
	}

}
