
public class Staticvariablemain 
{

public static void main(String arg[])
  {
	Staticvariable Obj1=new Staticvariable();
	Staticvariable Obj2=new Staticvariable();
	Staticvariable Obj3=new Staticvariable();
	
	System.out.println("Instance variable:"+Obj3.var1);//1
	
	//System.out.println("Static variable:"+Obj3.num1);//3
	
	System.out.println("Static variable:"+Staticvariable.num1);
  }
}
