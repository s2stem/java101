package JavaCourse;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cntr = 1;
		while (cntr <= 10) {
			System.out.println("Counter is: "+cntr);
			cntr++;
		}
		do {
			System.out.println("Counter is: "+cntr);
			cntr--;
		}while(cntr>=1);
	}

}
