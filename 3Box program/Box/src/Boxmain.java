
public class Boxmain {
	
	public static void main(String...arg) {
		Box boxObj=new Box();
		
		boxObj.setWidth(10);
		boxObj.setHeight(15);
		boxObj.setDepth(20);
		
		double volume;
		
		System.out.println("Width value is:"+boxObj.getWidth());
		System.out.println("Height value is:"+boxObj.getHeight());
		System.out.println("Depth value is:"+boxObj.getDepth());
		
		volume= boxObj.volume();
		System.out.println("The volume of box is:"+volume);
		
	}

}
