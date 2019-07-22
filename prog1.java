package JavaCourse;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog2 p2 = new prog2();
		int v1 = 10, v2 = 20;
		int sumv = 0, prodv = 0;
		prodv = prog2.prodoftwo(v1, v2);
		sumv  = p2.sumoftwo(v1, v2);
		System.out.println("Sum of Two is: "+sumv);
		System.out.println("Prod of Two is: "+prodv);
	}

}
