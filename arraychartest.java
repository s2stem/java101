package JavaCourse;

import java.util.Scanner;

public class arraychartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[][] ttt = new char[3][3];
		int i=0, j=0;
		String s1;
		//System.out.println("Enter String: ");
		
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				System.out.println("Enter Array["+i+"]["+j+"] :");
				//s1 = scan.nextLine();
				ttt[i][j] = scan.nextLine().charAt(0);			}
		}
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				System.out.print(ttt[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("End of Program");
	}

}
