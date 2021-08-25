
public class Box 
{
	double width;
	double height;
	double depth;
	
	//Default constructor
	public Box()
	{
		width=10;
		height=15;
		depth=20;		
	}
	//Single Parameterized constructor
	public Box(double val)
	{
		width=height=depth=val;
	}
	//Three parameterized constuctor
	public Box(double w,double h,double d)
	{
		width=(w>0)?w:1;
		height=(h>0)?h:1;
		depth=(d>0)?d:1;
	}
	public double volume()
	{
		return width*height*depth;
	}

}
