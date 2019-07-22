package JavaCourse;

public class prg1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mgSqr = new int[][] {{2,7,6},{9,5,1},{4,3,8}};
		int i, j;
/*		System.out.println(mgSqr[0][0]);
		System.out.println(mgSqr[0][1]);
		System.out.println(mgSqr[0][2]);
		
		System.out.println(mgSqr[1][0]);
		System.out.println(mgSqr[1][1]);
		System.out.println(mgSqr[1][2]);
		
		System.out.println(mgSqr[2][0]);
		System.out.println(mgSqr[2][1]);
		System.out.println(mgSqr[2][2]);
*/		
		for (i=0;i<3;i++) // Loop to iterate rows
		{
			for(j=0;j<3;j++) // Loop to iterate columns
			{
				System.out.print(mgSqr[i][j]+" ");				
			}
			System.out.println(); // Go to new line after every row
		}
	}

}
