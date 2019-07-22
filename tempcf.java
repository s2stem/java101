package JavaCourse;
import java.util.Scanner;
 
public class tempcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tempc, tempf;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temp in Centigrade: ");
		tempc = scan.nextFloat();
		tempf = tempctof(tempc);
		System.out.println("Temp in Farenheit: "+tempf);
		if ( tempf >= 0 && tempf <= 20)
			System.out.println("It is Freezing");
			else if (tempf > 20 && tempf <= 60)
				System.out.println("It is nice Spring Weather");
			else
				System.out.println("It is hot!!!");
		System.out.println("Enter Temp in Farenheit: ");
		tempf = scan.nextFloat();
		tempc = (tempf - 32) * 5 / 9;
		System.out.println("Temp in Centigrade: "+tempc);
	}
	public static float tempctof(float tmpc)
	{
		float localtempf;
		localtempf = (tmpc * 9 / 5) + 32;
		return localtempf;
	}
	public static float tempftoc(float tmpf)
	{
		float localtempc;
		localtempc = (tmpf - 32) * 5 / 9;
		return localtempc;
	}

}

