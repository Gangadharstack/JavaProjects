
public class Boxmain 
{
	public static void main(String arg[])
	{
		Box defaultBox=new Box();
		Box squareBox=new Box(10);
		Box userDefinedBox=new Box(11,12,13);
		
		System.out.println("The default Box volume:"+defaultBox.volume());
		System.out.println("The square Box volume:"+squareBox.volume());
		System.out.println("The user Defined Box volume:"+userDefinedBox.volume());
	}
}
