
public class Methodoverloadingmain {
	public static void main(String arg[])
	{
		Methodoverloading Obj=new Methodoverloading();
		
		System.out.println("Two Integer add() Method:"+Obj.add(101,201));
		System.out.println("Three Integer add() Method:"+Obj.add(101, 201, 301));
		System.out.println("Two Integer add() Method:"+Obj.add(201.34,345.33));
	}

}
