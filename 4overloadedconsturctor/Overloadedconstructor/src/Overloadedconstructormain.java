
public class Overloadedconstructormain
{
	public static void main(String arg[]) 
  {
	System.out.println("=== Iam in main() method ===");
	Overloadedconstructor Obj1= new Overloadedconstructor();
	System.out.println("====  Iam in main method ====");
	Overloadedconstructor Obj2=new Overloadedconstructor(101);
	System.out.println("==== Iam once again in main() method ====");
  }
}
