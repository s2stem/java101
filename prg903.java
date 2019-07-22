package JavaCourse;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java. util.*;

public class prg903 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			String name = "Saleem Shaik";
			// Create a String Variable with your Date Value
			String dobstr = "12/31/1998";
			// Convert your String into a Date variable/format
			Date dob = new SimpleDateFormat("mm/dd/yyyy").parse(dobstr);
			
			// Define a date format in which you want to display
			String datePattern = "dd-MMM-yyyy";
			// Create a SDF object with your pattern/date format
			SimpleDateFormat dtfor = new SimpleDateFormat(datePattern);
			
			System.out.println("Name: "+"\t"+name);
			//System.out.println("DOB:"+"\t"+dob);
			// Use the Date Format Object to display date in the pattern/format you want
			System.out.println("DOB:"+"\t"+dtfor.format(dob));
			float j1sal = 99.999f;
			float j2sal = 180.994f;
			float j3sal = 1638.103f;
			float totsal = j1sal + j2sal + j3sal;
			
			NumberFormat nb1 = NumberFormat.getCurrencyInstance();
			
			System.out.println("J1 Sal: "+ nb1.format(j1sal));
			System.out.println("J2 Sal: "+nb1.format(j2sal));
			System.out.println("J3 Sal: "+nb1.format(j3sal));
			System.out.println("Tot Sal: "+nb1.format(totsal));
	}

}
