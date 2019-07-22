package JavaCourse;

public class abcdmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=0, b=0, c=0, d=0, ddd=0;
int ab=0, cd=0, abxcd=0;
for (a=0; a<10; a++)
{
	for (b=0; b<10; b++)
	{
		for (c=0; c<10; c++)
		{
			for (d=0; d<10; d++)
			{
				ab = (a * 10) +  b;
				cd = (c * 10) + d;
				abxcd = ab * cd;
				ddd = (d * 100) + (d * 10) + d;
				if (abxcd == ddd && a != b && c != d)
				{
					System.out.println(a+" "+b+" "+c+" "+d+" "+abxcd);
				}
			}
		}
	}
}
}

}
