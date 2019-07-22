package JavaCourse;
import java.util.Arrays;

public class prg1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myFamilyAges = new int[] {42,12,4,40,2,39};
		//String[] mynames = new String[] {"Alec","Noelle","Justin","Saleem"};
		Arrays.sort(myFamilyAges);
		//Arrays.sort(mynames);
		//System.out.println(Arrays.toString(myIntArray));
		//System.out.println(Arrays.toString(mynames));
		System.out.println("Number of members in my family: "+myFamilyAges.length);
		System.out.println("Youngest in my family is "+myFamilyAges[0]+" years.");
		System.out.println("Oldest in my family is "+myFamilyAges[myFamilyAges.length-1]+" years.");
	}

}
