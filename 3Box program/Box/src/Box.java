
public class Box {

	private double width;
	private double height;
	private double depth;
	
	//Implementing the getter and setter method
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = (width>0)? width:1;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = (height>0)? height:1;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = (depth>0)? depth:1;
	}		
	//implementing	object manulation method
		public double volume(){
			return width*height*depth;

	}
}
