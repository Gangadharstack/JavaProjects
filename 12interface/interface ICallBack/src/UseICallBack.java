
public class UseICallBack implements ICallBack
{
	public void CallBack(int var1)
	{
		System.out.println("var1:"+var1);
		
	}
	public static void main(String args[])
	{
		UseICallBack callBackObj=new UseICallBack();
		
		callBackObj.CallBack(100);
	}

}
