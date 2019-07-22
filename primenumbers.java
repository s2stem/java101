package JavaCourse;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1=0;
		int i = 0;
		int j = 0;	
		
		System.out.print("Prime Numbers: ");
		for(i=2
				;i<100; i++) {
			for (j=2; j<i; j++) {
//				num1 i % j;
				if ( i % j == 0)
					break;
			}
			if ( j == i )
					System.out.print(i+" "); //Display Number and space
		}
	}
}
