
public class Course 
{
	String CourseId;
	String CourseName;
	int price;
	
	public Course()
	{}
		public Course(String CId,String CName,int price)
		{
			this.CourseId=CId;
			this.CourseName=CName;
			this.price=price;
		}
		public void showCourseDetail()
		{
			System.out.println("Course ID:"+CourseId);
			System.out.println("Course Name:"+CourseName);
			System.out.println("price:"+price);
		}
		public String getCourseId() {
			return CourseId;
		}
		public void setCourseId(String courseId) {
			this.CourseId = courseId;
		}
		public String getCourseName() {
			return CourseName;
		}
		public void setCourseName(String courseName) {
			this.CourseName = courseName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
 }

	
