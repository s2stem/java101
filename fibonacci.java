package JavaCourse;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int currnum = 0;
		for (int cntr=0; cntr<10; cntr++) {
			currnum = num1 + num2;
			System.out.print(currnum+" ");
			num1 = num2;
			num2 = currnum;
		}
	}

}
