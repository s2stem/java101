package JavaCourse;
import java.util.Scanner;

public class prg1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] myIntArray = new int[] {21,3,4,15};
		int totArray=0;
		for (int i =0; i<myIntArray.length; i++)
		{
			System.out.println("Enter Array Value "+i+" : ");
			myIntArray[i] = scan.nextInt();
		}
		for (int i =0; i<myIntArray.length; i++)
		{
			System.out.println("Array "+i+" : "+myIntArray[i]);
			totArray = totArray + myIntArray[i];
		}
		System.out.println("Total of Numbers is "+totArray);
	}

}
